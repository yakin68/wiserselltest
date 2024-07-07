package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePageStepdefinitions {

    HomePage homePage = new HomePage();
       Actions actions=new Actions(Driver.driver);

    @Given("Web tarayıcısını aç")
    public void web_tarayıcısını_aç() {

    }

    @Given("Wisersell'in {string} adresine git")
    public void wisersell_in_adresine_git(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
        ReusableMethods.bekle(3);

    }

    @Given("Ana sayfada Wisersell'in resmi logosunun görünür olduğunu doğrula")
    public void ana_sayfada_wisersell_in_resmi_logosunun_görünür_olduğunu_doğrula() {

        Assert.assertTrue(homePage.homePage_Logo.isDisplayed());

    }

    @Given("Ana sayfada Login butonunun görünür olduğunu doğrula")
    public void ana_sayfada_butonunun_görünür_olduğunu_doğrula() {
        Assert.assertTrue(homePage.homePage_Header_LoginButton.isDisplayed());
    }

    @Then("Açılan sayfa url adresinin {string} olduğunu doğrula")
    public void açılan_sayfa_url_adresinin_olduğunu_doğrula(String homeUrl) {
        String expectedUrl = Driver.getDriver().getCurrentUrl();
        String actualUrl = ConfigReader.getProperty(homeUrl);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("Tarayıcıyı kapat")
    public void tarayıcıyı_kapat() {
        Driver.quitDriver();

    }

    @Given("Sayfa dil seçeneğini  İngilizce olarak seç")
    public void sayfa_dil_seçeneğini_ingilizce_olarak_seç() {
        homePage.homePage_languageButton.click();
        ReusableMethods.bekle(1);
        try {
            actions.click(homePage.homePage_EnglishSection).perform();
        } catch (Exception e) {
            try {
                ReusableMethods.jseClick(homePage.homePage_EnglishSection);
            } catch (Exception ex) {
                ReusableMethods.bekle(5);
                homePage.homePage_EnglishSection.click();
            }
        }


        ReusableMethods.bekle(1);

    }

    @Given("Sayfa dil seçeneğini  Türkçe olarak seç")
    public void sayfa_dil_seçeneğini_türkçe_olarak_seç() {
        homePage.homePage_languageButton.click();
        ReusableMethods.bekle(1);
        try {
            homePage.homePage_TurkishSection.click();
        } catch (Exception e) {
            try {
                actions.click(homePage.homePage_TurkishSection).perform();
            } catch (Exception ex) {
                ReusableMethods.jseClick(homePage.homePage_TurkishSection);
            }
        }
        ReusableMethods.bekle(1);

    }

    @Given("Sayfa dilinin İngilizce olduğunu doğrula")
    public void sayfa_dilinin_i̇ngilizce_olduğunu_doğrula() {
        Assert.assertTrue(homePage.homePage_EnglishIcon.isDisplayed());

    }

    @Given("Sayfa dilinin Türkçe olduğunu doğrula")
    public void sayfa_dilinin_türkçe_olduğunu_doğrula() {
        Assert.assertTrue(homePage.homePage_TurkishIcon.isDisplayed());

    }

    @Given("Eğer cookies varsa kabul et")
    public void eğerCookiesVarsaKabulEt() {
        try {
            homePage.homePage_cookiesAccept.click();
        } catch (Exception e) {
            System.out.println("Cookies bulunmamaktadır");
        }

    }

    @Then("{int} saniye bekle")
    public void saniyeBekle(int arg0) {
        ReusableMethods.bekle(arg0);
    }

//=========================================
   /* @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        homePage.signUpLinki.click();
    }

    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        homePage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(homePage.mrRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("183644")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Ali")
                .sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(10);

        actions .click(homePage.formSoyisimKutusu)
                .sendKeys("Kaygisiz")
                .sendKeys(Keys.TAB)
                .sendKeys("Yildiz holding")
                .sendKeys(Keys.TAB)
                .sendKeys("star street")
                .sendKeys(Keys.TAB)
                .sendKeys("yildiz mah")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("75001")
                .sendKeys(Keys.TAB)
                .sendKeys("+1123124543").perform();



            ReusableMethods.bekle(10);




    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        homePage.createAccountButonu.click();

    }
    @Then("hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        Assert.assertTrue(homePage.accountCreatedYazisi.isDisplayed());
    }

    @And("user Create an account bolumune email adresi girer")
    public void userCreateAnAccountBolumuneEmailAdresiGirer() {

        homePage.signUpEmailKutusu.sendKeys("aklauy@gmail.com");
        homePage.isimKutusu.sendKeys("Ali");

    }*/


}
