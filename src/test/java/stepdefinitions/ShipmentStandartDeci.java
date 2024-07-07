package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OrderPage;
import pages.ShipmentPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class ShipmentStandartDeci {

    Actions actions = new Actions(driver);
    ShipmentPage shipmentPage = new ShipmentPage();
    OrderPage orderPage = new OrderPage();

String desiName;


    @Given("Standart Desi sekmesine tıkla")
    public void standart_desi_sekmesine_tıkla() {
        shipmentPage.shipmendPage_standartDesiButton.click();
        ReusableMethods.bekle(1);

    }
    @Given("Standart Desi Oluştur butonuna tıkla")
    public void standart_desi_oluştur_butonuna_tıkla() {
        shipmentPage.shipmendPage_standartDesi_standartDesiOlusturButton.click();
        ReusableMethods.bekle(1);

    }
    @Given("Standart Desi Oluştur alanının açıldığını doğrula")
    public void standart_desi_oluştur_alanının_açıldığını_doğrula() {
        assertTrue(shipmentPage.shipmendPage_standartDesi_standartDesiOlusturPage.isDisplayed());

    }
    @Given("İsim kutucuğuna {string} gir")
    public void i̇sim_kutucuğuna_gir(String string) {
        desiName=string;
        shipmentPage.shipmendPage_standartDesi_standartDesiOlusturButton_isim.sendKeys(desiName);

    }
    @Given("Tebrikler Başarıyla kaydedildi mesajının görünür olduğunu doğrula")
    public void tebrikler_başarıyla_kaydedildi_mesajının_görünür_olduğunu_doğrula() {
        assertTrue(shipmentPage.shipmendPage_standartDesi_basariylaKaydedildiMessage.isDisplayed());


    }
    @Given("Standart desi listesinde oluşturulan standart desinin görünür olduğunu doğrula")
    public void standart_desi_listesinde_oluşturulan_standart_desinin_görünür_olduğunu_doğrula() {

        String expectedName = desiName;
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);


        orderPage.OrderPage_filtreleriGosterGizle.click();
        ReusableMethods.bekle(2);


        shipmentPage.shipmendPage_standartDesi_nameFilterBox.sendKeys(desiName);
        ReusableMethods.bekle(2);
        String actualName = shipmentPage.shipmendPage_standartDesi_firstDeciName.getText();

        assertEquals(expectedName,actualName);

    }
    @Given("ilgili standart desiye ait işlemler \\(...) sekmesine tıkla")
    public void ilgili_standart_desiye_ait_işlemler_sekmesine_tıkla() {
        shipmentPage.shipmendPage_standartDesi_firstDeci_islemler.click();


    }

    @Given("Oluşturulan standart desiyi silmek için Sil butonuna tıkla")
    public void oluşturulan_standart_desiyi_silmek_için_sil_butonuna_tıkla() {
    shipmentPage.shipmendPage_standartDesi_firstDeci_islemler_sil.click();
    }

    @Given("Standart Desi Sil alanının açıldığını doğrula")
    public void standart_desi_sil_alanının_açıldığını_doğrula() {
        assertTrue(shipmentPage.shipmendPage_standartDesi_silOnayKutusu.isDisplayed());

    }
    @Given("Evet butonuna tıkla")
    public void evet_butonuna_tıkla() {
        shipmentPage.shipmendPage_standartDesi_silOnayKutusu_evetButonu.click();

    }
    @Given("Tebrikler ... numaralı desi başarıyla silindi mesajının görünür olduğunu doğrula")
    public void tebrikler_numaralı_desi_başarıyla_silindi_mesajının_görünür_olduğunu_doğrula() {
        assertTrue(shipmentPage.shipmendPage_standartDesi_tebriklerMessageBox.isDisplayed());
    }



}
