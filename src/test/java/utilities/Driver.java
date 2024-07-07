package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {
    /*
        Bu class'in amaci
        belirlenen browser'a uygun webDriver objesi olusturmak
     */

    private Driver() {
        // baska class'larin Driver class'indan obje olusturmasini engellemek icin
        // Singleton pattern kullanilmistir
        // Singleton pattern class'dan obje olusturulmasini engellemek icin
        // constructor'i gorunur yapip, erisimini private yapmaya dayanir
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {

        String browserTercihi = ConfigReader.getProperty("browser");
        /*
            Browser'in sadece chrome olmamasi icin
            configuration.properties'e browser = firefox
            secenegi ekledik.

            Orada yazan browser tercihini 22.satirda alip
            tercihe uygun driver olusturmasi icin
            bir switch statement kullandik
         */


        if (driver == null) {

            switch (browserTercihi) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();

                    //=====GitHub Action ile çalıştırabilmek için GitHub'a bu kısım push yapılacak
                    FirefoxOptions FireOptions = new FirefoxOptions();
                    FireOptions.addArguments("--no-sandbox");
                    FireOptions.addArguments("--disable-dev-shm-usage");
                    FireOptions.addArguments("--headless");
                    driver = new FirefoxDriver(FireOptions);

                    //  driver = new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();


                    //=====GitHub Action ile çalıştırabilmek için GitHub'a bu kısım push yapılacak
                    EdgeOptions EdgeOptions = new EdgeOptions();
                    EdgeOptions.addArguments("--no-sandbox");
                    EdgeOptions.addArguments("--disable-dev-shm-usage");
                    EdgeOptions.addArguments("--headless");
                    driver = new EdgeDriver(EdgeOptions);

                    // driver = new EdgeDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;


                case "git":

                    WebDriverManager.chromedriver().setup();
                    //=====GitHub Action ile çalıştırabilmek için GitHub'a bu kısım push yapılacak
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);

                    //===========Chrone yavaşlatma=============
                    waitForPageLoad(driver);
                    //==========================================

                    driver.manage().window().setSize(new Dimension(1920, 1080));

                    break;

                default:

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(); //Github'a push yapılmadan önce bu satır yoruma alınmalı
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));






        }

        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void waitForPageLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

}
