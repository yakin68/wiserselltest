package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.awt.image.Kernel;

import static utilities.Driver.driver;

public class UserPageStepdefinition {

    UserPage userPage = new UserPage();

    @Given("Wisersel logosu altında Hoşgeldiniz karşılama mesajını görünür olduğunu doğrula")
    public void wisersel_logosu_altında_hoşgeldiniz_karşılama_mesajını_görünür_olduğunu_doğrula() {
        try {
            Assert.assertTrue(userPage.userPage_Hosgeldiniz.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.bekle(5);
            Assert.assertTrue(userPage.userPage_Hosgeldiniz.isDisplayed());
        }
    }

    @Given("Sol alt kısımda doğru kullanıcı bilgilerinin göründüğünü doğrula")
    public void sol_alt_kısımda_doğru_kullanıcı_bilgilerinin_göründüğünü_doğrula() {

        String expectedName = ConfigReader.getProperty("kayitliName");
        String actualName = userPage.userPage_leftDownUserProfilNameInfo.getText();
        Assert.assertEquals(expectedName, actualName);

    }

    @Given("Sağ üst kısımda bulunan profil simgesini tıkla")
    public void sağ_üst_kısımda_bulunan_profil_simgesini_tıkla() {
        try {
            userPage.userPage_rightUpUserProfilIcon.click();
            ReusableMethods.bekle(1);
        } catch (Exception e) {
            ReusableMethods.bekle(10);
            userPage.userPage_rightUpUserProfilIcon.click();
            ReusableMethods.bekle(1);
        }

    }

    @Given("Doğru profil bilgilerinin görünür olduğunu doğrula")
    public void doğru_profil_bilgilerinin_görünür_olduğunu_doğrula() {
        String expectedMailName = ConfigReader.getProperty("kayitliEmail");
        String actualMailName = userPage.userPage_profileIconEmailInfo.getText();
        Assert.assertEquals(expectedMailName, actualMailName);

    }

    @Given("Sayfada tanıtıcı sliderın görünür olduğunu doğrula")
    public void sayfada_tanıtıcı_sliderın_görünür_olduğunu_doğrula() {

        Assert.assertTrue(userPage.userPage_slider.isDisplayed());

    }

    @Given("Sliderı manüel olarak sola kaydır")
    public void sliderı_manüel_olarak_sola_kaydır() {

        for (int i = 0; i < 7; i++) {
            ReusableMethods.jseClick(userPage.userPage_sliderLeftButton);
            ReusableMethods.bekle(1);
        }
    }

    @Given("Sliderı manüel olarak sağa kaydır")
    public void sliderı_manüel_olarak_sağa_kaydır() {

        for (int i = 0; i < 7; i++) {
            ReusableMethods.jseClick(userPage.userPage_sliderRighButton);
            ReusableMethods.bekle(1);
        }
    }

    @Given("Sayfada Duyurular alanının görünür olduğunu doğrula")
    public void sayfada_duyurular_alanının_görünür_olduğunu_doğrula() {
        ReusableMethods.sayfaKaydir();
        ReusableMethods.bekle(1);
        Assert.assertTrue(userPage.userPage_duyurular.isDisplayed());

    }


}
