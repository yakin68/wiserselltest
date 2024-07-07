package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //HomePage Wisersell Logo
    @FindBy(xpath = "//a[@class='css-13biwtz']")
    public WebElement homePage_Logo;

    //HomePage Header Login Button
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement homePage_Header_LoginButton;

    //Dil seçim ikonu
    @FindBy(id="long-button")
    public WebElement homePage_languageButton;

    //İngilizce Dil Seçeneği
    @FindBy(xpath = "(//div[@class='MuiStack-root css-csffzd'])[3]")
    public WebElement homePage_EnglishSection;

    //Türkçe Dil Seçeneği
    @FindBy(xpath = "(//div[@class='MuiStack-root css-csffzd'])[2]")
    public WebElement homePage_TurkishSection;

    //ingilizce Doğrulama Metin
    @FindBy(xpath = "//img[@alt='en']")
    public WebElement homePage_EnglishIcon;

    //Türkçe Doğrulama Metin
    @FindBy(xpath = "//img[@alt='tr']")
    public WebElement homePage_TurkishIcon;

    //HomePage Get Start butonu
    @FindBy(xpath = "//a[text()='Get Start']")
    public WebElement homePage_body_getStartButton;

    //HomePage cookies accept button
    @FindBy(xpath = "//button[@aria-label='Accept cookies']")
    public WebElement homePage_cookiesAccept;



   /*  @FindBy(xpath = "//*[@*='fa fa-lock']")
    public WebElement signUpLinki;

   @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement signUpEmailKutusu;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement isimKutusu;

    @FindBy(id = "id_gender1")
    public WebElement mrRadioButton;

    @FindBy(id = "last_name")
    public WebElement formSoyisimKutusu;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedYazisi;*/
}
