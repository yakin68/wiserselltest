package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.UserPage;
import pages.UserProfilePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class UserProfileStepDefinitions {
    UserProfilePage userProfilePage = new UserProfilePage();
    UserPage userPage = new UserPage();

    @Given("Açılan menüden profil sekmesine tıkla")
    public void açılan_menüden_profil_sekmesine_tıkla() {
        userProfilePage.userProfilePage_ProfileSection.click();
    }

    @Given("Change Password alanının görünür olduğunu doğrula")
    public void change_password_alanının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(userProfilePage.userProfilePage_ChangePasswordText.isDisplayed());
    }

    @Given("Current Password kutucuğuna {string} gir")
    public void current_password_kutucuğuna_gir(String string) {
        userProfilePage.userProfilePage_CurrentPasswordTextBox.sendKeys(ConfigReader.getProperty(string));

    }

    @Given("New Password kutucuğuna {string} gir")
    public void new_password_kutucuğuna_gir(String string) {
        userProfilePage.userProfilePage_newPasswordTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Confirm Password kutucuğuna {string} gir")
    public void confirm_password_kutucuğuna_gir(String string) {
        userProfilePage.userProfilePage_confirmPasswordTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Tebrikler Başarıyla Güncellendi mesajının görünür olduğunu doğrula")
    public void tebrikler_başarıyla_güncellendi_mesajının_görünür_olduğunu_doğrula() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(userProfilePage.userProfilePage_TebriklerMessage.isDisplayed());
    }

    @Given("Sol alt kısımda bulunan profil Logout simgesine tıkla")
    public void sol_alt_kısımda_bulunan_profil_logout_simgesine_tıkla() {

        userProfilePage.userProfilePage_LeftDownLogoutButton.click();
        ReusableMethods.bekle(5);
    }

    @Given("Save butonuna tıkla")
    public void save_butonuna_tıkla() {
        userProfilePage.userProfilePage_ChangePasswordSaveButton.click();

    }

    @Given("Current Password kutucuğunu görünür yap")
    public void current_password_kutucuğunu_görünür_yap() {
        userProfilePage.userProfilePage_CurrentPasswordEyeIcon.click();
    }

    @Given("New Passwor kutucuğunu görünür yap")
    public void new_passwor_kutucuğunu_görünür_yap() {
        userProfilePage.userProfilePage_NewPasswordEyeIcon.click();
    }

    @Given("Confirm Password kutucuğunu görünür yap")
    public void confirm_password_kutucuğunu_görünür_yap() {
        userProfilePage.userProfilePage_ConfirmPasswordEyeIcon.click();
    }

}
