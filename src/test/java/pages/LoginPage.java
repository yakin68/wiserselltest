package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //LoginPage email kutusu
    @FindBy(id = "email")
    public WebElement loginPage_emailBox;

    //LoginPage şifre kutusu
    @FindBy(id = "password")
    public WebElement loginPage_passwordBox;

    //LoginPage giriş yap butonu
    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    public WebElement loginPage_enteryButton;

    //LoginPage giriş yap text
    @FindBy(xpath = "(//*[text()='Giriş Yap'])[1]")
    public WebElement loginPage_pageText;

    //LoginPage Mail doğrulama mesajı
    @FindBy(xpath = "(//*[text()='Lütfen hesabınızı doğrulayınız. Doğrulama maili gelmediyse tekrar isteyebilirsiniz.'])[1]")
    public WebElement loginPage_verifyAccountMessage;

    //LoginPage Mail "Email veya Şifreyi Hatalı Girdiniz"  mesajı
    @FindBy(xpath = "//*[text()='Email veya Şifreyi Hatalı Girdiniz']")
    public WebElement loginPage_emaiPassworWrongMessage;


    //LoginPage logo
    @FindBy(xpath = "//a[@class='css-13biwtz']")
    public WebElement loginPage_wisersellLogo;

    //LoginPage "Bir hesap oluştur"
    @FindBy(xpath = "//*[text()='Bir hesap oluştur']")
    public WebElement loginPage_birHesapOlustur;

        //LoginPage ForgetPassword
    @FindBy(xpath = "//*[text()='ForgetPassword']")
    public WebElement loginPage_ForgetPassword;



//=====================FORGET PASSWORD=====================

    //LoginPage_ForgetPassword Teprikler şifre yenileme linki gönderildi mesajı"
    @FindBy(xpath = "//*[text()='Tebrikler']")
    public WebElement forgetPasswordTebrikler;


      //LoginPage_ForgetPassword reset email kutusu"
    @FindBy(xpath = "//input[@id='reset-email']")
    public WebElement forgetPassword_resetEmailBox;


      //LoginPage_ForgetPassword Butonu
    @FindBy(xpath = "//button[text()='Forgot Password']")
    public WebElement forgetPassword_forgotPasswordButton;




}
