package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.UserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginPageStepdefinitions {

    LoginPage loginPage = new LoginPage();

    UserPage userPage = new UserPage();

    HomePage homePage = new HomePage();

    @Given("Login sayfasının açıldığını doğrula")
    public void login_sayfasının_açıldığını_doğrula() {
        Assert.assertTrue(loginPage.loginPage_wisersellLogo.isDisplayed());
    }


    @Given("E-posta kutucuğuna kayıtlı {string} adresini gir")
    public void e_posta_kutucuğuna_kayıtlı_adresini_gir(String string) {
        loginPage.loginPage_emailBox.sendKeys(ConfigReader.getProperty(string));

    }

    @Given("Şifrenin yanlış girildiği uyarısını gör")
    public void şifrenin_yanlış_girildiği_uyarısını_gör() {
        Assert.assertTrue(loginPage.loginPage_emaiPassworWrongMessage.isDisplayed());

    }

    @Given("Login butonuna tıkla")
    public void login_butonuna_tıkla() {
      homePage.homePage_Header_LoginButton.click();
    }



//===========FORGET PASSWORD===================


@Given("ForgetPassword sekmesine tıkla")
public void forget_password_sekmesine_tıkla() {
        loginPage.loginPage_ForgetPassword.click();

}
@Given("Email Adress kutucuğuna kayıtlı {string} adresini gir")
public void email_adress_kutucuğuna_kayıtlı_adresini_gir(String string) {
        loginPage.forgetPassword_resetEmailBox.sendKeys(ConfigReader.getProperty(string));

}
@Given("Forgot Password butonuna tıkla")
public void forgot_password_butonuna_tıkla() {
        loginPage.forgetPassword_forgotPasswordButton.click();

}
@Given("Tebrikler \"mail\"adresine şifre yenileme linki gönderildi mesajının göründünüğünü doğrula")
public void tebrikler_mail_adresine_şifre_yenileme_linki_gönderildi_mesajının_göründünüğünü_doğrula() {

        Assert.assertTrue(loginPage.forgetPasswordTebrikler.isDisplayed());

}


}
