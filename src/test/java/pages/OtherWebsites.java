package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OtherWebsites {

    public OtherWebsites() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TempMail mail adresi text kutusu
    @FindBy(xpath = "//*[@id=\"Dont_use_WEB_use_API\"]")
    public WebElement tempmail_copyMail;

    //TempMail dismiss button
    @FindBy(xpath = "//*[@id=\"dismiss-button\"]")
    public WebElement tempmail_dismissButton;

           //TempMail ilk mail
    @FindBy(xpath = "//*[@id=\"__nuxt\"]/div/div[2]/main/div[2]/div[2]/ul/li/a/div")
    public WebElement tempmail_firstMail;

    //fake mail sitesi  mail kutusu "Verify Account"
    @FindBy(xpath = "//*[text()='Verify Account']")
    public WebElement fakemail_verifyAccount;

 //fake mail sitesi  iframe
    @FindBy(xpath = "//iframe[@class='w-full']")
    public WebElement fakemail_iframe;

   //Download klasörü değiştirme tarihi
    @FindBy(xpath = "//*[@id='dateColumnHeader']")
    public WebElement lokalDowloadPageDegistirmeTarih;

   //Download klasörü değiştirme tarihi ilk satır
    @FindBy(xpath = "//*[@id=\"tbody\"]/tr[1]/td[3]")
    public WebElement lokalDowloadPageTarihIlkSatir;



}
