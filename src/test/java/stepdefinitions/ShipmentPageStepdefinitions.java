package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.OrderPage;
import pages.ShipmentPage;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class ShipmentPageStepdefinitions {

    Actions actions = new Actions(driver);

    ShipmentPage shipmentPage = new ShipmentPage();
    OrderPage orderPage = new OrderPage();
    String alici;

    @Given("Kargo oluştur seçeneğini tıkla")
    public void kargo_oluştur_seçeneğini_tıkla() {
        ReusableMethods.bekle(1);
        ReusableMethods.jseClick(shipmentPage.shipment_kargoOlusturButton);
        ReusableMethods.bekle(1);
    }

    @Given("Kargo oluşturma alanının açıldığını doğrula")
    public void kargo_oluşturma_alanının_açıldığını_doğrula() {
        Assert.assertTrue(shipmentPage.shipment_kargoOlusturPage.isDisplayed());

    }

    @Given("Boy kutucuğuna {int} gir")
    public void boy_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_boy.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("En kutucuğuna {int} gir")
    public void en_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_en.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("Yükseklik kutucuğuna {int} gir")
    public void yükseklik_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_yukseklik.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("Ağırlık kutucuğuna {int} gir")
    public void ağırlık_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_agirlik.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("Miktar kutucuğuna {int} gir")
    public void miktar_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_miktar.clear();
        ReusableMethods.bekle(1);
        shipmentPage.shipment_kargoOlusturPage_miktar.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("Tarif Kodu kutucuğuna {int} gir")
    public void tarif_kodu_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_tariff.sendKeys(Integer.toString(int1));
        ReusableMethods.bekle(1);
    }

    @Given("Fiyat Al tıkla")
    public void fiyat_al_tıkla() {
        shipmentPage.shipment_kargoOlusturPage_fiyatAlButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("Herhangi bir kargoyu tıkla")
    public void herhangi_bir_kargoyu_tıkla() {

        try {
            shipmentPage.shipment_kargoOlusturPage_fiyatAl_fiyatBilgileri.click();
            ReusableMethods.bekle(1);
        } catch (Exception e) {
            shipmentPage.shipment_kargoOlusturPage_fiyatAl_OzelFiyatBilgileri.click();
            ReusableMethods.bekle(1);
        }

    }

    @Given("Para birimi sekmesini tıkla")
    public void para_birimi_sekmesini_tıkla() {
        shipmentPage.shipment_kargoOlusturPage_paraBirimi.click();
        ReusableMethods.bekle(1);

    }

    @Given("İlgili para birimini seç")
    public void i̇lgili_para_birimini_seç() {
        shipmentPage.shipment_kargoOlusturPage_paraBirimi_USD.click();
        ReusableMethods.bekle(1);

    }

    @Given("Gönderi tipini Tıkla")
    public void gönderi_tipini_tıkla() {
        shipmentPage.shipment_kargoOlusturPage_gonderimTipi.click();
        ReusableMethods.bekle(1);
    }

    @Given("Gönderi tipini DAP seç ve DAP seçildiğini doğrula")
    public void gönderi_tipini_dap_seç_ve_dap_seçildiğini_doğrula() {
        shipmentPage.shipment_kargoOlusturPage_gonderimTipi_DAP.click();
        ReusableMethods.bekle(1);

        Assert.assertEquals(shipmentPage.shipment_kargoOlusturPage_gonderimTipi.getText(), "DAP");

    }

    @Given("Tip sekmesini tıkla")
    public void tip_sekmesini_tıkla() {
        shipmentPage.shipment_kargoOlusturPage_Tip.click();
        ReusableMethods.bekle(1);


    }

    @Given("Tipi VAT seç")
    public void tipi_vat_seç() {
        shipmentPage.shipment_kargoOlusturPage_Tip_VAT.click();
        ReusableMethods.bekle(1);

    }

    @Given("VAT IOSS Numarası kutucuğuna {int} gir")
    public void vat_ioss_numarası_kutucuğuna_gir(Integer int1) {
        shipmentPage.shipment_kargoOlusturPage_vatioss.sendKeys(Integer.toString(int1));

    }

    @Given("Amaç sekmesine tıkla")
    public void amaç_sekmesine_tıkla() {
        shipmentPage.shipment_kargoOlusturPage_amac.click();
        ReusableMethods.bekle(1);

    }

    @Given("Amaç olarak herhangi bir seçeneği seç")
    public void amaç_olarak_herhangi_bir_seçeneği_seç() {
        try {
            shipmentPage.shipment_kargoOlusturPage_amac_firstSection.click();
            ReusableMethods.bekle(1);
        } catch (Exception e) {
        }

    }

    @Given("Gümrük bedelini {int} olarak gir")
    public void gümrük_bedelini_olarak_gir(Integer int1) {
      //  Actions actions1=new Actions(driver);
     //  actions1.doubleClick(shipmentPage.shipment_kargoOlusturPage_gumrukBedeli);
     //   String actualValue=shipmentPage.shipment_kargoOlusturPage_gumrukBedeli.getText();
     //  System.out.println("Mevcut gümrük bedeli"+actualValue);
     //   double actual=Double.parseDouble(actualValue);
     //  System.out.println("Double gümrük bedeli"+actual);
      String expectedValue=String.valueOf(int1);
     //  System.out.println("Olması gereken Gümrük değeri"+expectedValue);

        shipmentPage.shipment_kargoOlusturPage_gumrukBedeli.sendKeys(Keys.CONTROL + "a");
        shipmentPage.shipment_kargoOlusturPage_gumrukBedeli.sendKeys(Keys.DELETE);

             shipmentPage.shipment_kargoOlusturPage_gumrukBedeli.clear();
             shipmentPage.shipment_kargoOlusturPage_gumrukBedeli.sendKeys(expectedValue);

    }

    @Given("Tebrikler Kargo Başarıyla Oluşturuldu mesajının görünür olduğunu doğrula")
    public void tebrikler_kargo_başarıyla_oluşturuldu_mesajının_görünür_olduğunu_doğrula() {
        try {
            Assert.assertTrue(shipmentPage.shipment_kargoBasariylaOlusturuldu.isDisplayed());
        } catch (Exception e) {
            ReusableMethods.bekle(1);
            Actions actions = new Actions(driver);
            actions.click(orderPage.orderStatusBox_KaydetButton).perform();
            ReusableMethods.bekle(1);
            Assert.assertTrue(shipmentPage.shipment_kargoBasariylaOlusturuldu.isDisplayed());
        }


    }

    @Given("Kargo sekmesine tıkla")
    public void kargo_sekmesine_tıkla() {
        shipmentPage.shipment_leftMenu_KargoSection.click();
        ReusableMethods.bekle(2);


    }

    @Given("Bekleyen Kargolar sekmesine tıkla")
    public void bekleyen_kargolar_sekmesine_tıkla() {

        shipmentPage.shipment_leftMenu_Kargo_bekleyenKargolar.click();
    }

    @Given("Ürün listesinde ilk ürünün Alıcı bilgisini kaydet")
    public void ürün_listesinde_ilk_ürünün_alıcı_bilgisini_kaydet() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderPage_firstOrderAliciName).perform();
        ReusableMethods.bekle(1);
        alici = orderPage.orderPage_firstOrderAliciName.getText();
    }

    @Given("Kargo Etiketi Oluştur sekmesine tıkla")
    public void kargo_etiketi_oluştur_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur.click();

    }

    @Given("Kargo profilini seç")
    public void kargo_profilini_seç() {
        ReusableMethods.bekle(2);
        actions.click(shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_kargoProfil).perform();

        ReusableMethods.bekle(1);

    }

    @Given("Yazıcı tipini seç")
    public void yazıcı_tipini_seç() {
        ReusableMethods.bekle(2);
        try {
            Actions actions1=new Actions(driver);
            actions1.click(shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi).perform();
            ReusableMethods.bekle(1);
            shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi_termal.click();
        } catch (Exception e) {
            Actions actions1=new Actions(driver);
            ReusableMethods.bekle(2);
            shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi.click();
            ReusableMethods.bekle(1);
            shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi_termal.click();
        }



    }

    @Given("Kargo gönder sekmesine tıkla")
    public void kargo_gönder_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bekleyenKargolar_firstOrder_kargoGonder.click();
    }

    @Given("Kargo gönder kutucuğunun açıldığını doğrula")
    public void kargo_gönder_kutucuğunun_açıldığını_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(shipmentPage.shipmendPage_bekleyenKargolar_firstOrder_kargoGonderBox.isDisplayed());
    }

    @Given("Gönder butonuna tıkla")
    public void gönder_butonuna_tıkla() {
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bekleyenKargolar_firstOrder_kargoGonderBox_gonderButton.click();

    }

    @Given("Tebrikler Kargonuz Gönderildi mesajının göründüğünü doğrula")
    public void tebrikler_kargonuz_gönderildi_mesajının_göründüğünü_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(shipmentPage.shipmendPage_bekleyenKargolar_tebriklerKargonuzGonderildi.isDisplayed());
    }

    @Given("Sol meü barında Gönderilmiş Kargolar sekmesine tıkla")
    public void sol_meü_barında_gönderilmiş_kargolar_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_gonderilmisKargolar.click();

    }

    @Given("İlgili ürünün gönderilmiş kargolar alanında görünür olduğunu doğrula")
    public void i̇lgili_ürünün_gönderilmiş_kargolar_alanında_görünür_olduğunu_doğrula() {
        String expectedAlici = alici;
        System.out.println("Expected Alıcı Adı: "+expectedAlici);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        orderPage.OrderPage_filtreleriGosterGizle.click();
        ReusableMethods.bekle(1);
        shipmentPage.gönderilmisKargolar_aliciFilterTextBox.sendKeys(expectedAlici);
        ReusableMethods.bekle(1);
        actions.doubleClick(shipmentPage.shipmendPage_bekleyenKargolar_firstOrderLabelNo).perform();
        ReusableMethods.bekle(1);
        String actualAlici = shipmentPage.shipmendPage_gonderilmisKargolar_firstName_AliciAdi.getText();
        System.out.println("Actual Alıcı Adı: "+actualAlici);
        Assert.assertEquals(expectedAlici, actualAlici);

    }

    @Given("Eğer varsa paket tipini seç")
    public void eğer_varsa_paket_tipini_seç() {


        try {
            ReusableMethods.bekle(1);
            actions.click(shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_paketTipi).perform();
            ReusableMethods.bekle(1);
            shipmentPage.shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_paketTipi_first.click();
        } catch (Exception e) {

        }


    }

    @Given("Yazıcıdan kargo etiket alma sayfasının açıldığını doğrula")
    public void yazıcıdan_kargo_etiket_alma_sayfasının_açıldığını_doğrula() {
        ReusableMethods.bekle(4);
        String expectedTitle = driver.getTitle();
        System.out.println("Expected title:"+expectedTitle);
        String actualTitle = "shipment";
        Assert.assertTrue(expectedTitle.contains(actualTitle));
        System.out.println("Actuel title:"+actualTitle);

    }


    @Given("Kargo ücreti {int} ise {int} gir")
    public void kargo_ücreti_ise_gir(Integer int1, Integer int2) {

        String expectedValue=shipmentPage.shipment_kargoOlusturPage_kargoUcreti.getText();
        String actualValue= String.valueOf(int1);

        if (expectedValue.equals(actualValue)){
            ReusableMethods.bekle(1);
            shipmentPage.shipment_kargoOlusturPage_kargoUcreti.sendKeys(String.valueOf(int2));
        }

    }



}
