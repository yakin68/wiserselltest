package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class RegisterPageStepdefinition {
    Faker faker = new Faker();

    String fakemail;

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    OtherWebsites otherWebsites = new OtherWebsites();

    UserPage userPage = new UserPage();
    OrderPage orderPage = new OrderPage();
    Actions action = new Actions(driver);

    String registerName;

    //===================TC03_01=======================

    @Given("FakeMail adresi almak için ilgili siteye git ve mail adresini kopyala")
    public void fake_mail_adresi_almak_için_ilgili_siteye_git_ve_mail_adresini_kopyala() {
        ReusableMethods.openNewTab();
        ReusableMethods.changeTab();
        driver.get("https://mail.tm/en/");
        ReusableMethods.bekle(5);
        otherWebsites.tempmail_copyMail.click();
        otherWebsites.tempmail_copyMail.sendKeys(Keys.chord(Keys.CONTROL, "a"));

        fakemail = ReusableMethods.secilenMetniAlma();


    }

    @Given("Wisersell sayfasına tekrar dön")
    public void wisersell_sayfasına_tekrar_dön() {
        ReusableMethods.changeTab();
    }

    @Given("Get Start butonuna tıkla")
    public void get_start_butonuna_tıkla() {
        homePage.homePage_body_getStartButton.click();
    }

    @Given("E-mail kutucuğuna fake email adresi gir")
    public void e_mail_kutucuğuna_fake_email_adresi_gir() {
        registerPage.register1_emailTextBox.click();
        registerPage.register1_emailTextBox.sendKeys(fakemail);
    }

    @Given("Password kutucuğuna {string} gir")
    public void password_kutucuğuna_gir(String validPassword) {
        registerPage.register1_passwordTextBox.click();
        registerPage.register1_passwordTextBox.sendKeys(ConfigReader.getProperty(validPassword));
    }

    @Given("Name kutusuna {string} gir")
    public void name_kutusuna_gir(String name) {
        registerPage.register1_nameTextBox.click();
        registerPage.register1_nameTextBox.sendKeys(ConfigReader.getProperty(name));
    }

    @Given("Surname kutusuna {string} gir")
    public void surname_kutusuna_gir(String surName) {
        registerPage.register1_surNameTextBox.click();
        registerPage.register1_surNameTextBox.sendKeys(ConfigReader.getProperty(surName));
        ReusableMethods.bekle(1);
    }


    @Given("Privacy Policy checkBox kutucuğunu işaretle")
    public void privacy_policy_checkBox_kutucuğunu_işaretle() {
        registerPage.register1_privacyPolicyCheckBox.click();

    }
    @Given("Distance Policy checkBox kutucuğunu işaretle")
    public void distance_policy_checkBox_kutucuğunu_işaretle() {
        registerPage.register1_distancePolicyCheckBox.click();

    }
    @Given("Return Policy checkBox kutucuğunu işaretle")
    public void return_policy_checkBox_kutucuğunu_işaretle() {
        registerPage.register1_returnPolicyCheckBox.click();

    }


    @Given("Next butonuna tıkla")
    public void next_butonuna_tıkla() {
        registerPage.register1_nextButton.click();
    }

    @Given("Tekrar email kutucuğuna fake email adresi gir")
    public void tekrar_email_kutucuğuna_fake_email_adresi_gir() {
        registerPage.register2_emailTextBox.click();
        registerPage.register2_emailTextBox.sendKeys(fakemail);
    }

    @Given("Organizasyon name kutucuğuna {string} gir")
    public void organizasyon_name_kutucuğuna_gir(String string) {
        String originalString = faker.name().fullName();
        String organization = originalString.replaceAll("\\s", "").toLowerCase();

        registerPage.register2_organizationNameTextBox.click();
        registerPage.register2_organizationNameTextBox.sendKeys(organization);
    }

    @Given("Phone kutucuğuna {string} gir")
    public void phone_kutucuğuna_gir(String string) {
        registerPage.register2_phoneTextBox.click();
        registerPage.register2_phoneTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Adress kutucuğuna {string} gir")
    public void adress_kutucuğuna_gir(String string) {
        registerPage.register2_addressTextBox.click();
        registerPage.register2_addressTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("City kutucuğuna {string} gir")
    public void city_kutucuğuna_gir(String string) {
        registerPage.register2_cityTextBox.click();
        registerPage.register2_cityTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("State kutucuğuna {string} gir")
    public void state_kutucuğuna_gir(String string) {
        registerPage.register2_stateTextBox.click();
        registerPage.register2_stateTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Posta Code kutucuğuna {string} gir")
    public void posta_code_kutucuğuna_gir(String string) {
        registerPage.register2_postalCodeTextBox.click();
        registerPage.register2_postalCodeTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("Country kutucuğuna tıkla ve Türkiye seç")
    public void country_kutucuğuna_tıkla_ve_türkiye_seç() {
        registerPage.register2_countryTextBox.click();
        registerPage.register2_countryTextBox.sendKeys("Turkiye");
        action.sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(1);
    }

    @Given("Finish butonuna tıkla")
    public void finish_butonuna_tıkla() {
        registerPage.register2_finishButton.click();

    }

    @Given("Tebrikler Kayıt işlemi Tamamlandı yazan onay kutusunun açıldığını gör")
    public void tebrikler_kayıt_işlemi_tamamlandı_yazan_onay_kutusunun_açıldığını_gör() {
        Assert.assertTrue(registerPage.register_kayitIslemiTamamlandiMessage.isDisplayed());
    }

    @Given("Ok butonuna tıkla")
    public void ok_butonuna_tıkla() {
        registerPage.register_okButton.click();
        ReusableMethods.bekle(1);
    }

    @Given("Giris yap butonuna tıkla")
    public void giris_yap_butonuna_tıkla() {
        registerPage.register_girisYap.click();
    }


    @Given("Tekrar fakeMail sayfasına geçiş yap")
    public void tekrar_fake_mail_sayfasına_geçiş_yap() {
        ReusableMethods.changeTab();
        ReusableMethods.bekle(10);

    }

    @Given("Mail boxta Wisersellden gelen maili aç")
    public void mail_boxta_wisersellden_gelen_maili_aç() {
        ReusableMethods.jseClick(otherWebsites.tempmail_firstMail);
        ReusableMethods.bekle(3);


    }


    @Given("Verify Account butonuna tıkla")
    public void Verify_Account_butonuna_tıkla() {


        // İframe içeriğine geçiş yap

        try {
            driver.switchTo().frame(otherWebsites.fakemail_iframe);
            ReusableMethods.jseClick(otherWebsites.fakemail_verifyAccount);
        } catch (Exception e) {
            driver.navigate().refresh();
            try {
                ReusableMethods.jseClick(otherWebsites.fakemail_verifyAccount);
            } catch (Exception ex) {
                ReusableMethods.jseClick(otherWebsites.tempmail_firstMail);
                ReusableMethods.bekle(3);
                driver.switchTo().frame(otherWebsites.fakemail_iframe);
                ReusableMethods.jseClick(otherWebsites.fakemail_verifyAccount);
            }
        }
        ReusableMethods.bekle(3);
        ReusableMethods.changeTab();
    }

    @Given("Wisersel login sayfasının açıldığını doğrula")
    public void wisersel_login_sayfasının_açıldığını_doğrula() {


    }

    @Given("Email kutucuğuna fake email adresi gir")
    public void email_kutucuğuna_fake_email_adresi_gir() {
        loginPage.loginPage_emailBox.sendKeys(fakemail);


    }

    @Given("Şifre kutusuna {string} gir")
    public void şifre_kutusuna_gir(String string) {
        loginPage.loginPage_passwordBox.sendKeys(string);
    }

    @Given("Şifre kutucuğuna {string} gir")
    public void şifre_kutucuğuna_gir(String string) {
        try {
            loginPage.loginPage_passwordBox.sendKeys(ConfigReader.getProperty(string));
        } catch (Exception e) {
            loginPage.loginPage_passwordBox.sendKeys(ConfigReader.getProperty("valid_password"));
        }

    }


    @Given("Giriş yap butonuna tıkla")
    public void giriş_yap_butonuna_tıkla() {
        loginPage.loginPage_enteryButton.click();
        ReusableMethods.bekle(3);

    }

    @Given("Wisersell Kullanıcı arayüzüne giriş yapıldığını doğrula")
    public void wisersell_kullanıcı_arayüzüne_giriş_yapıldığını_doğrula() {
        try {
            Assert.assertTrue(userPage.userPage_Hosgeldiniz.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.bekle(7);
            Assert.assertTrue(userPage.userPage_Hosgeldiniz.isDisplayed());
        }
    }


    //===================TC03_02=======================
    @Given("{string} uyarısının verildiğini doğrula")
    public void uyarısının_verildiğini_doğrula(String string) {
        Assert.assertTrue(loginPage.loginPage_verifyAccountMessage.isDisplayed());
    }

    //===================TC03_03=======================
    @Given("Bir hesap oluştur sekmesine tıkla")
    public void bir_hesap_oluştur_sekmesine_tıkla() {
        loginPage.loginPage_birHesapOlustur.click();
    }


    @Given("{string}  uyarısının göründüğünü doğrula")
    public void uyarısının_göründüğünü_doğrula(String string) {
        Assert.assertTrue(registerPage.loginPage_buMailKullaniliyor.isDisplayed());
    }


    //===================TC03_04=======================
    @Given("E-mail kutucuğuna {string} adresi gir")
    public void e_mail_kutucuğuna_adresi_gir(String string) {
        registerPage.register1_emailTextBox.sendKeys(ConfigReader.getProperty(string));
    }

    @Given("E-mail kutucu altında beliren uyarı mesajının göründüğünü doğrula")
    public void e_mail_kutucu_altında_beliren_uyarı_mesajının_göründüğünü_doğrula() {
        System.out.println("=========>>>>>  " + registerPage.register1_invalidMailMessage.getText());
        Assert.assertTrue(registerPage.register1_invalidMailMessage.isDisplayed());
    }

    @Given("Password kutucuğu altında beliren uyarı mesajının göründüğünü doğrula")
    public void password_kutucuğu_altında_beliren_uyarı_mesajının_göründüğünü_doğrula() {
        System.out.println("=========>>>>>" + registerPage.register1_invalidPasswordMessage.getText());
        Assert.assertTrue(registerPage.register1_invalidPasswordMessage.isDisplayed());
    }

    @Given("Kullanıcı sekmesine tıkla")
    public void kullanıcı_sekmesine_tıkla() {
        orderPage.orderPage_leftSetting_UserButton.click();
    }

    @Given("Filtreleri göster gizle simgesine tıkla")
    public void filtreleri_göster_gizle_simgesine_tıkla() {
        orderPage.OrderPage_filtreleriGosterGizle.click();
    }

    @Given("Açılan name filtre alanaına {string} gir")
    public void açılan_name_filtre_alanaına_gir(String string) {
        ReusableMethods.bekle(1);
        orderPage.orderPage_leftSetting_nameFilterTextBox.sendKeys(ConfigReader.getProperty(string));
        registerName = ConfigReader.getProperty(string);
    }

    @Given("Açılan menüden Delete butonuna tıkla")
    public void açılan_menüden_delete_butonuna_tıkla() {

        if (orderPage.orderPage_userPage_firstUserLineNameBox.getText().equals(registerName)){
            orderPage.orderPage_userPage_deleteButton.click();
            ReusableMethods.bekle(1);
        }


    }

    @Given("Sil butonuna tıkla")
    public void sil_butonuna_tıkla() {
        orderPage.orderPage_userPage_silButton.click();
        ReusableMethods.bekle(1);
    }

    @Given("Silme işleminin başarılı olduğuna dair Tebrikler mesajının görünür olduğunu doğrula")
    public void silme_işleminin_başarılı_olduğuna_dair_tebrikler_mesajının_görünür_olduğunu_doğrula() {

        Assert.assertTrue(orderPage.orderDetail_tebriklerKaydedildiBox.isDisplayed());

    }

    @Given("Eğer varsa başka testautomation kullanıcıları onları da sil")
    public void eğer_varsa_başka_testautomation_kullanıcıları_onları_da_sil() {
boolean kosul=orderPage.orderPage_firstOrderIslemler.isDisplayed();
        try {
            while (kosul){

                driver.navigate().refresh();
                orderPage.OrderPage_filtreleriGosterGizle.click();
                ReusableMethods.bekle(1);
                orderPage.orderPage_leftSetting_nameFilterTextBox.sendKeys(registerName);
                ReusableMethods.bekle(1);

                if (orderPage.orderPage_userPage_firstUserLineNameBox.getText().equals(registerName)){
                    orderPage.orderPage_firstOrderIslemler.click();
                    ReusableMethods.bekle(1);
                    orderPage.orderPage_userPage_deleteButton.click();
                    ReusableMethods.bekle(1);
                    orderPage.orderPage_userPage_silButton.click();
                    ReusableMethods.bekle(1);
                    registerPage.register_okButton.click();
                    ReusableMethods.bekle(1);
                }

            }
        } catch (Exception e) {

        }

    }
}
