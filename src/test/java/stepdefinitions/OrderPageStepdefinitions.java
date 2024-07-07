package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.OrderPage;
import pages.OtherWebsites;
import pages.ShipmentPage;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static utilities.Driver.driver;

public class OrderPageStepdefinitions {

    OrderPage orderPage = new OrderPage();
    OtherWebsites otherWebsites = new OtherWebsites();
    LoginPage loginPage = new LoginPage();
    ShipmentPage shipmentPage = new ShipmentPage();

    String labelNo;


    @Given("Sol menü barından Sipariş sekmesini tıkla")
    public void sol_menü_barından_sipariş_sekmesini_tıkla() {
        ReusableMethods.bekle(1);
        try {
            ReusableMethods.jseClick(orderPage.orderPage_siparisSection);
        } catch (Exception e) {
            ReusableMethods.bekle(10);
            ReusableMethods.jseClick(orderPage.orderPage_siparisSection);
        }

    }

    @Given("Açılan menüden Açık sekmesini tıkla")
    public void açılan_menüden_açık_sekmesini_tıkla() {
        try {
            orderPage.orderPage_acikSection.click();
            ReusableMethods.bekle(2);
        } catch (Exception e) {
            ReusableMethods.bekle(3);
            orderPage.orderPage_acikSection.click();
            ReusableMethods.bekle(4);
        }

    }

    @Given("Sipariş sayfa bilgileri alanının açıldığını doğrula")
    public void sipariş_sayfa_bilgileri_alanının_açıldığını_doğrula() {
        Assert.assertTrue(orderPage.orderPage_siparisBilgileriText.isDisplayed());
    }

    @Given("İşlemler üst başlığının görünür olduğunu doğrula")
    public void i̇şlemler_üst_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_islemlerSection.isDisplayed());

    }

    @Given("Tümünü Seç kutucuğunun görünür ve aktif olduğunu doğrula")
    public void tümünü_seç_kutucuğunun_görünür_ve_aktif_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_tumunuSec.isDisplayed());
    }

    @Given("Platform başlığının görünür olduğunu doğrula")
    public void platform_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_PlatformSection.isDisplayed());

    }

    @Given("Label No başlığının görünür olduğunu doğrula")
    public void label_no_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_labelNoSection.isDisplayed());

    }

    @Given("Sipariş No başlığının görünür olduğunu doğrula")
    public void sipariş_no_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_siparisNoSection.isDisplayed());
    }

    @Given("Alıcı başlığının görünür olduğunu doğrula")
    public void alıcı_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_aliciSection.isDisplayed());
    }

    @Given("Sipariş ayrıntıları başlığının görünür olduğunu doğrula")
    public void sipariş_ayrıntıları_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_siparisAyrintilariSection.isDisplayed());
    }

    @Given("Servis Seviyesi başlığının görünür olduğunu doğrula")
    public void servis_seviyesi_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_servisSeviyesiSection.isDisplayed());
    }


    @Given("Sipariş Tarihi başlığının görünür olduğunu doğrula")
    public void sipariş_tarihi_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_siparisTarihiSection.isDisplayed());
    }

    @Given("Ülke başlığının görünür olduğunu doğrula")
    public void ülke_başlığının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderPage_ulkeSection.isDisplayed());

    }


    @Given("Search simgesine tıkla")
    public void search_simgesine_tıkla() {
        ReusableMethods.bekle(2);
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderPage_firstOrderLabelNo).perform();
        labelNo = orderPage.orderPage_firstOrderLabelNo.getText();
        System.out.println(">>>>>>> " + labelNo);
        ReusableMethods.bekle(1);
        ReusableMethods.jseClick(orderPage.orderPage_searchButton);
        ReusableMethods.bekle(1);
    }

    @Given("Açılan search textBox'a ilk ürünün Label No'sunu yaz")
    public void açılan_search_text_box_a_ilk_ürünün_label_no_sunu_yaz() {

        orderPage.orderPage_searchTextBox.sendKeys(labelNo);


    }

    @Given("Ekrana gelen sipariş ile aranan siparişin eşleştiğini doğrula")
    public void ekrana_gelen_sipariş_ile_aranan_siparişin_eşleştiğini_doğrula() {
        String expectedValue = labelNo;
        String actualValue = orderPage.orderPage_firstOrderLabelNo.getText();
        Assert.assertEquals(expectedValue, actualValue);

    }

    @Given("Search textbox'ı temizle")
    public void search_textbox_ı_temizle() {
        orderPage.orderPage_searchClearXbutton.click();
        Assert.assertTrue(orderPage.orderPage_searchTextBox.getText().isEmpty());

    }

    @Given("Tümünü seç kutucuğunu tıkla")
    public void tümünü_seç_kutucuğunu_tıkla() {
        try {
            orderPage.orderPage_tumunuSec.click();
            ReusableMethods.bekle(1);
        } catch (Exception e) {
            ReusableMethods.bekle(5);
            orderPage.orderPage_tumunuSec.click();
            ReusableMethods.bekle(1);
        }
    }

    @Given("{string} benzeri yazının göründüğünü doğrula")
    public void benzeri_yazının_göründüğünü_doğrula(String string) {
        Assert.assertTrue(orderPage.orderPage_tumunuSecMessageText.isDisplayed());
    }

    @Given("Seçimi Temizle sekmesine tıkla")
    public void seçimi_temizle_sekmesine_tıkla() {
        orderPage.orderPage_secimiTemizle.click();
    }

    @Given("Platform sütun başlığına tıkla")
    public void platform_sütun_başlığına_tıkla() {
        orderPage.orderPage_PlatformSection.click();

    }

    @Given("Liste sıralamasının değiştiğini doğrula")
    public void liste_sıralamasının_değiştiğini_doğrula() {
        String expectedValue = labelNo;
        String actualValue = orderPage.orderPage_firstOrderLabelNo.getText();
        Assert.assertNotEquals(expectedValue, actualValue);

    }

    @Given("Label No sütun başlığına tıkla")
    public void label_no_sütun_başlığına_tıkla() {
        orderPage.orderPage_labelNoSection.click();

    }

    @Given("Sipariş No sütun başlığına tıkla")
    public void sipariş_no_sütun_başlığına_tıkla() {
        orderPage.orderPage_siparisNoSection.click();

    }

    @Given("Alıcı sütun bailığına tıkla")
    public void alıcı_sütun_bailığına_tıkla() {
        orderPage.orderPage_aliciSection.click();
    }

    @Given("Sipariş ayrıntıları sütun başlığına tıkla")
    public void sipariş_ayrıntıları_sütun_başlığına_tıkla() {
        orderPage.orderPage_siparisAyrintilariSection.click();
    }

    @Given("Servis Seviyesi sütun başlığına tıkla")
    public void servis_seviyesi_sütun_başlığına_tıkla() {
        orderPage.orderPage_servisSeviyesiSection.click();

    }

    @Given("Sipariş Tarihi sütun başlığına tıkla")
    public void sipariş_tarihi_sütun_başlığına_tıkla() {
        orderPage.orderPage_siparisTarihiSection.click();

    }

    @Given("Ülke sütun başlığına tıkla")
    public void ülke_sütun_başlığına_tıkla() {
        orderPage.orderPage_ulkeSection.click();

    }

    @Given("Listenin başındaki ürün seçme kutucuğunu tıkla")
    public void listenin_başındaki_ürün_seçme_kutucuğunu_tıkla() {
        ReusableMethods.jseClick(orderPage.orderPage_firstOrderSellectBox);
    }

    @Given("Ürün Listesi sekmesine tıkla")
    public void ürün_listesi_sekmesine_tıkla() {
        orderPage.orderPage_urunListesiSection.click();
        ReusableMethods.bekle(3);
    }

    @Given("Ürün listesinin excell olarak indirildiğini doğrula")
    public void ürün_listesinin_excell_olarak_indirildiğini_doğrula() {
        /*Farklı kaydet pencerisi açıldığında, tarayıcı üzerindeki diğer elementlere erişim engellenir.
         Selenium ile bu elementlere erişmeye çalıştığınızda hata alırsınız. Bu durumu kontrol ederek
         diyalog kutusunun açıldığını doğrulayabiliriz.*/

        ReusableMethods.openNewTab();
        ReusableMethods.changeTab();
        // Kullanıcının ana dizinini al
        String homeDirectory = System.getProperty("user.home");
        // PC'nin indirme klasörünü belirle
        String downloadFolder = homeDirectory + "/Downloads";
        driver.get(downloadFolder);
        ReusableMethods.bekle(2);
        otherWebsites.lokalDowloadPageDegistirmeTarih.click();
        // Şu anki tarih ve saat bilgisini al
        LocalDateTime now = LocalDateTime.now();

        // Tarih ve saat bilgisini istediğiniz formatta biçimlendir
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = now.format(formatter);
        String expectedTarih = formattedDateTime.replaceAll("[^0-9]", "");

        System.out.println("Sistem saati=" + expectedTarih);

        String downloadTarih = otherWebsites.lokalDowloadPageTarihIlkSatir.getText();
        String actualTarih = "0" + downloadTarih.replaceAll("[^0-9]", "");

        System.out.println("Download saati= " + actualTarih);

        Assert.assertTrue(actualTarih.contains(expectedTarih));

    }

    @Given("Sipariş Yenile sekmesine tıkla")
    public void sipariş_yenile_sekmesine_tıkla() {
        orderPage.orderPage_siparisleriYenileSection.click();

    }

    @Given("Sipariş yenileme kutucuğunun açıldığını doğrula")
    public void sipariş_yenileme_kutucuğunun_açıldığını_doğrula() {

        Assert.assertTrue(orderPage.orderPage_siparisYenilemeBox.isDisplayed());

    }

    @Given("Siparişler yenileme işlemi bitene kadar bekle")
    public void siparişler_yenileme_işlemi_bitene_kadar_bekle() {
        ReusableMethods.waitForVisibility(orderPage.orderPage_siparislerYenilendiMessageBox, 100);

    }

    @Given("Sipariş yenileme işlemi başarıyla tamamlandı mesajını gör")
    public void sipariş_yenileme_işlemi_başarıyla_tamamlandı_mesajını_gör() {
        Assert.assertTrue(orderPage.orderPage_siparislerYenilendiMessageBox.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @Given("Tamam butonuna tıkla")
    public void tamam_butonuna_tıkla() {
        orderPage.orderPage_tamamButton.click();
    }


    @Given("Ürün listesinde ilk ürünün Label No'sunu kaydet")
    public void ürün_listesinde_ilk_ürünün_label_no_sunu_kaydet() {
        ReusableMethods.bekle(2);
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderPage_firstOrderLabelNo).perform();
        ReusableMethods.bekle(1);
        String str = orderPage.orderPage_firstOrderLabelNo.getText();
        labelNo = str;

        System.out.println("Label no kırpılmış hali: " + labelNo);
    }


    @Given("Ürün listesinde ilk ürüne ait işlemler \\(...) sekmesini tıkla")
    public void ürün_listesinde_ilk_ürüne_ait_işlemler_sekmesini_tıkla() {
        ReusableMethods.bekle(1);
        orderPage.orderPage_firstOrderIslemler.click();


    }

    @Given("Açılan menüden Detay Gör'e tıkla")
    public void açılan_menüden_detay_gör_e_tıkla() {
        orderPage.orderPage_detayGor.click();

    }

    @Given("Açılan ürün detaylarının Label No'sunun doğru Label No olduğunu doğrula")
    public void açılan_ürün_detaylarının_label_no_sunun_doğru_label_no_olduğunu_doğrula() {

        String expectedLabelNo = labelNo;
        System.out.println("Expected LabelNo: " + expectedLabelNo);
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderPage_firstOrderLabelNo).perform();
        String actualLabelNo = orderPage.orderPage_firstOrderLabelNo.getText();
        System.out.println("Actual LabelNo: " + actualLabelNo);

        Assert.assertEquals(expectedLabelNo, actualLabelNo);

    }

    @Given("Alıcı bilgileri düzenleme simgesine tıkla")
    public void alıcı_bilgileri_düzenleme_simgesine_tıkla() {
        orderPage.orderDetail_aliciBilgileriEditIcon.click();

    }

    @Given("Alıcı satırında isim soyisim sonuns xyz ilave et.")
    public void alıcı_satırında_isim_soyisim_sonuns_xyz_ilave_et() {
        orderPage.orderDetail_aliciBilgileriAliciTextBox.sendKeys("xyz");

    }

    @Given("Alıcı bilgileri değişikliklerini kaydetmek için onay simgesine tıkla")
    public void alıcı_bilgileri_değişikliklerini_kaydetmek_için_onay_simgesine_tıkla() {
        ReusableMethods.bekle(1);
        orderPage.orderDetail_aliciBilgileriCheckTick.click();

    }

    @Given("Tebrikler Kaydedildi mesajının göründüğünü doğrula")
    public void tebrikler_kaydedildi_mesajının_göründüğünü_doğrula() {
        Assert.assertTrue(orderPage.orderDetail_tebriklerKaydedildiBox.isDisplayed());

    }

    @Given("Alıcı Bilgilerinde yapılan değişikliğin görünür olduğunu doğrula")
    public void alıcı_bilgilerinde_yapılan_değişikliğin_görünür_olduğunu_doğrula() {

        Assert.assertTrue(orderPage.orderDetail_aliciBilgileriAliciLine.getText().contains("xyz"));
    }

    @Given("Fatura Bilgileri alanına geçiş için Fatura Bilgileri üst başlığı tıkla")
    public void fatura_bilgileri_alanına_geçiş_için_fatura_bilgileri_üst_başlığı_tıkla() {
        orderPage.orderDetail_faturaBilgileri_button.click();

    }

    @Given("Fatura bilgileri düzenleme simgesini tıkla")
    public void fatura_bilgileri_düzenleme_simgesini_tıkla() {
        orderPage.orderDetail_faturaBilgileriEditIcon.click();
    }

    @Given("Adres ilk satıra xyz ilave et")
    public void adres_ilk_satıra_xyz_ilave_et() {
        orderPage.orderDetail_faturaBilgileriAdressTextBox.sendKeys("xyz");
    }

    @Given("Fatura bilgileri değişikliklerini kaydetmek için onay simgesine tıkla")
    public void fatura_bilgileri_değişikliklerini_kaydetmek_için_onay_simgesine_tıkla() {
        orderPage.orderDetail_faturaBilgileriCheckTick.click();


    }

    @Given("Fatura Bilgilerinde yapılan değişikliğin görünür olduğunu doğrula")
    public void fatura_bilgilerinde_yapılan_değişikliğin_görünür_olduğunu_doğrula() {

        Assert.assertTrue(orderPage.orderDetail_FaturaBilgileriAdressLine.getText().contains("xyz"));

    }

    @Given("Notlar düzenleme simgesini tıkla")
    public void notlar_düzenleme_simgesini_tıkla() {
        orderPage.orderDetail_notlarEditIcon.click();

    }

    @Given("Kullanıcı notu satırına xyz ilave et")
    public void kullanıcı_notu_satırına_xyz_ilave_et() {
        orderPage.orderDetail_notlarkullaniciNotuTextBox.sendKeys("xyz");

    }

    @Given("Notlar değişikliklerini kaydetmek için onay simgesine tıkla")
    public void notlar_değişikliklerini_kaydetmek_için_onay_simgesine_tıkla() {
        orderPage.orderDetail_NotlarCheckTick.click();

    }

    @Given("Notlar alanında yapılan değişikliğin görünür olduğunu doğrula")
    public void notlar_alanında_yapılan_değişikliğin_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderDetail_notlarkullaniciNotuLine.getText().contains("xyz"));

    }

    @Given("Kişiselleştirme düzenleme simgesini tıkla")
    public void kişiselleştirme_düzenleme_simgesini_tıkla() {
        Actions actions = new Actions(driver);
        actions.click(orderPage.orderDetail_kisilestirmeEditIcon).sendKeys(Keys.END).perform();
        ReusableMethods.bekle(3);
        //orderPage.orderDetail_kisilestirmeEditIcon.click();

    }

    @Given("Açılan alana xyz ilave et")
    public void açılan_alana_xyz_ilave_et() {
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderDetail_kisilestirmetextBox);
        orderPage.orderDetail_kisilestirmetextBox.sendKeys("xyz");

    }

    @Given("Kişiselleştirme değişikliklerini kaydetmek için onay simgesine tıkla")
    public void kişiselleştirme_değişikliklerini_kaydetmek_için_onay_simgesine_tıkla() {
        orderPage.orderDetail_kisilestirmeCheckTick.click();

    }

    @Given("Kişiselleştirme alanında yapılan değişikliğin görünür olduğunu doğrula")
    public void kişiselleştirme_alanında_yapılan_değişikliğin_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderDetail_kisilestirmeLine.getText().contains("xyz"));

    }

    @Given("Sipariş detayını kapatmak için X Kapat butonunu tıkla")
    public void sipariş_detayını_kapatmak_için_x_kapat_butonunu_tıkla() {
        orderPage.orderDetail_Kapat2.click();
    }

    @Given("Sayfayı yenile")
    public void sayfayı_yenile() {
        driver.navigate().refresh();
        ReusableMethods.bekle(3);

    }

    @Given("Yapılan değişikliklerin sipariş listesindede görünür olduğunu doğrula")
    public void yapılan_değişikliklerin_sipariş_listesindede_görünür_olduğunu_doğrula() {
        System.out.println("Sipariş Alıcı adı:"+orderPage.orderPage_firstOrderAlici.getText());
        Assert.assertTrue(orderPage.orderPage_firstOrderAlici.getText().contains("xyz"));
        //Assert.assertTrue(orderPage.orderPage_firstOrderSiparisAyrintilari_Kisilestirme.getText().contains("xyz"));
    }

    @Given("Durum değiştir sekmesine tıkla")
    public void durum_değiştir_sekmesine_tıkla() {
        orderPage.orderPage_durumDegistir.click();

    }

    @Given("Durum Değiştir kutucuğunun açıldığını doğrula")
    public void durum_değiştir_kutucuğunun_açıldığını_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderPage_DurumDegistirBox.isDisplayed());
    }

    @Given("Tanımlı ilk statüyü tıkla")
    public void tanımlı_ilk_statüyü_tıkla() {
        orderPage.orderStatusBox_FirstStatus.click();
    }

    @Given("Kaydet butonuna tıkla")
    public void kaydet_butonuna_tıkla() {

        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.orderStatusBox_KaydetButton).perform();

    }

    @Given("Tebrikler Statüler Başarıyla Güncellendi mesajının görür olduğunu doğrula")
    public void tebrikler_statüler_başarıyla_güncellendi_mesajının_görür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.orderStatus_TebriklerMessage.isDisplayed());
    }

    @Given("Statü değiştirme kutucuğunu kapatmak için Kapat butonuna tıkla")
    public void statü_değiştirme_kutucuğunu_kapatmak_için_kapat_butonuna_tıkla() {
        orderPage.orderStatusBox_KapatButton.click();

    }

    @Given("Sipariş menüsü altında ilgili statüye tıkla")
    public void sipariş_menüsü_altında_ilgili_statüye_tıkla() {
        orderPage.orderMenu_FirstState.click();
        ReusableMethods.bekle(2);

    }

    @Given("Açılan sipariş listesinde taşınan siparişin göründüğünü Label No ile doğrula")
    public void açılan_sipariş_listesinde_taşınan_siparişin_göründüğünü_label_no_ile_doğrula() {
        String str = labelNo;
        int i = 0;
        while (i < str.length() && (Character.isLetter(str.charAt(i)) || str.charAt(i) == '0')) {
            i++;
        }
        labelNo = str.substring(i);

        String expectedLabelNo = labelNo;
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);

        orderPage.OrderPage_filtreleriGosterGizle.click();
        ReusableMethods.bekle(1);
        orderPage.orderPage_leftSetting_LabelFilterTextBox.sendKeys(expectedLabelNo);
        ReusableMethods.bekle(3);

        String str1 = orderPage.orderPage_firstOrderLabelNo.getText();
        int j = 0;
        while (j < str1.length() && (Character.isLetter(str1.charAt(j)) || str1.charAt(j) == '0')) {
            j++;
        }
        String actualLabelNo = str1.substring(j);

        System.out.println("Actual Label kırpılmış: " + actualLabelNo);
        Assert.assertEquals(expectedLabelNo, actualLabelNo);
    }


    @Given("Kargoya Hazır statüsüne alınan ürünü filtrele")
    public void kargoya_hazır_statüsüne_alınan_ürünü_filtrele() {
        ReusableMethods.bekle(1);
        System.out.println("*********" + labelNo);
        orderPage.OrderPage_filtreleriGosterGizle.click();
        ReusableMethods.bekle(1);
        orderPage.orderPage_leftSetting_LabelFilterTextBox.sendKeys(labelNo);
        ReusableMethods.bekle(1);
    }

    @Given("Sol menü barından Ayarlar sekmesini tıkla")
    public void sol_menü_barından_ayarlar_sekmesini_tıkla() {
        ReusableMethods.bekle(2);
        orderPage.orderPage_AyarlarSection.click();


    }

    @Given("Ayarlar altında Operasyonel Statüler sekmesine tıkla")
    public void ayarlar_altında_operasyonel_statüler_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        orderPage.orderSetting_OperasyonelStatulerSection.click();
    }

    @Given("Açılan sayfada Statü Ekle butonuna tıkla")
    public void açılan_sayfada_statü_ekle_butonuna_tıkla() {
        orderPage.orderSetting_OperasyonelStatuler_StatuEkleButton.click();
    }

    @Given("Açılan Kutucuğa statü adı olarak TestAutomation yaz")
    public void açılan_kutucuğa_statü_adı_olarak_test_automation_yaz() {
        orderPage.orderSetting_OperasyonelStatuler_StatuAdiTextBox.sendKeys("TestAutomation");

    }

    @Given("Açılan menüde TestAutomation statüsünün görünür olduğunu doğrula")
    public void açılan_menüde_test_automation_statüsünün_görünür_olduğunu_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderSetting_OperasyonelStatuler_TestAutomationStatus.isDisplayed());

    }

    @Given("Ekranda görünen statülerden TestAutomation statüsünü yanında bulunan delete butonuna tıkla")
    public void ekranda_görünen_statülerden_test_automation_statüsünü_yanında_bulunan_delete_butonuna_tıkla() {
        Actions actions = new Actions(driver);
        ReusableMethods.bekle(1);
        try {
            actions.click(orderPage.orderSetting_OperasyonelStatuler_TestAutomationStatus).perform();
            ReusableMethods.bekle(1);
        } catch (Exception e) {
            orderPage.orderSetting_OperasyonelStatuler_TestAutomationStatus.click();
            ReusableMethods.bekle(1);
        }
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();


    }

    @Given("Tebrikler Statü silindi mesajının göründüğünü doğrula")
    public void tebrikler_statü_silindi_mesajının_göründüğünü_doğrula() {
        try {
            Assert.assertTrue(orderPage.orderSetting_OperasyonelStatuler_TebrklerStatusSilindi.isDisplayed());
            ReusableMethods.bekle(1);
        } catch (Exception e) {
            ReusableMethods.bekle(2);
            Assert.assertTrue(orderPage.orderSetting_OperasyonelStatuler_TebrklerStatusSilindi.isDisplayed());
            ReusableMethods.bekle(1);
        }

    }

    @Given("Açılan menüden Etiket Olustur'a tıkla")
    public void açılan_menüden_etiket_olustur_a_tıkla() {

        orderPage.orderPage_etiketOlustur.click();
    }

    @Given("Termal Etiket Düzeni radio butonuna tıkla")
    public void termal_etiket_düzeni_radio_butonuna_tıkla() {
        orderPage.orderSetting_createLabel_TermalEtiketDuzeni.click();

    }

    @Given("Etiket Al butonuna tıkla")
    public void etiket_al_butonuna_tıkla() {
        orderPage.orderSetting_createLabel_EtiketAlButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("Açılan yeni sayfaya geç")
    public void açılan_yeni_sayfaya_geç() {
        ReusableMethods.bekle(8);
        ReusableMethods.changeTab();
        ReusableMethods.bekle(3);

    }

    @Given("Yazıcıdan etiket alma sayfasının açıldığını doğrula")
    public void yazıcıdan_etiket_alma_sayfasının_açıldığını_doğrula() {
        String expectedValue = "blob:https://";
        String actualValue = driver.getCurrentUrl();
        System.out.println("expected: "+expectedValue);
        System.out.println("actual :"+actualValue);
        ReusableMethods.bekle(3);
        Assert.assertTrue(actualValue.contains(expectedValue));

    }


    @Given("Ürün Bazlı A4 Etiket Düzeni radio butonuna tıkla")
    public void ürün_bazlı_a4_etiket_düzeni_radio_butonuna_tıkla() {
        orderPage.orderSetting_createLabel_UrunBazliA4EtiketDuzeni.click();

    }


    @Given("Sipariş Bazlı A4 Etiket Düzeni radio butonuna tıkla")
    public void sipariş_bazlı_a4_etiket_düzeni_radio_butonuna_tıkla() {
        orderPage.orderSetting_createLabel_SiparisbazliA4EtiketDuzeni.click();

    }


    @Given("Harici Gönderi Kapama sekmesine tıkla")
    public void harici_gönderi_kapama_sekmesine_tıkla() {
        orderPage.orderPage_hariciGonderimKapama.click();
        ReusableMethods.bekle(2);
    }

    @Given("Harici Sipariş Kapama alanının açıldığını doğrula")
    public void harici_sipariş_kapama_alanının_açıldığını_doğrula() {
        Assert.assertTrue(orderPage.externalOrderCloseBox.isDisplayed());


    }

    @Given("Boy kutucuğuna {int} yaz")
    public void boy_kutucuğuna_yaz(Integer int1) {
        orderPage.externalOrderCloseBox_boyTextBox.sendKeys(Integer.toString(int1));

    }

    @Given("En kutucuğuna {int} yaz")
    public void en_kutucuğuna_yaz(Integer int1) {
        orderPage.externalOrderCloseBox_enTextBox.sendKeys(Integer.toString(int1));

    }

    @Given("Yükseklik kutucuğuna {int} yaz")
    public void yükseklik_kutucuğuna_yaz(Integer int1) {
        orderPage.externalOrderCloseBox_yukseklikTextBox.sendKeys(Integer.toString(int1));
    }

    @Given("Ağırlık kutucuğuna {int} yaz")
    public void ağırlık_kutucuğuna_yaz(Integer int1) {
        orderPage.externalOrderCloseBox_agirlikTextBox.sendKeys(Integer.toString(int1));
    }

    @Given("Miktar kutucuğuna {int} yaz")
    public void miktar_kutucuğuna_yaz(Integer int1) {
        orderPage.externalOrderCloseBox_miktarTextBox.sendKeys(Integer.toString(int1));

    }

    @Given("kargo firması kutucuğun tıklayarak drop down menüyü aç")
    public void kargo_firması_kutucuğun_tıklayarak_drop_down_menüyü_aç() {
        Actions actions = new Actions(driver);
        actions.click(orderPage.externalOrderCloseBox_kargoFirmasiTextBox).perform();
        ReusableMethods.bekle(1);

    }

    @Given("Herhangi bir kargo sirketini sec")
    public void herhangi_bir_kargo_sirketini_sec() {
        orderPage.externalOrderCloseBox_kargoFirmasi_firstSection.click();
    }

    @Given("Tebrikler Siparişiniz Başarıyla Kapatıldı mesajının görünür olduğunu doğrula")
    public void tebrikler_siparişiniz_başarıyla_kapatıldı_mesajının_görünür_olduğunu_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.externalOrderClose_tebriklerSiparisnizBasariylaKapatildi.isDisplayed());

    }

    @Given("Açık sipariş listesinde siparişin görünmediğini doğrula")
    public void açık_sipariş_listesinde_siparişin_görünmediğini_doğrula() {
        String expectedValue = labelNo;
        ReusableMethods.bekle(2);
        Actions actions = new Actions(driver);
        actions.doubleClick(orderPage.orderPage_firstOrderLabelNo).perform();
        ReusableMethods.bekle(1);
        String actuelValue = orderPage.orderPage_firstOrderLabelNo.getText();

        Assert.assertNotEquals(expectedValue, actuelValue);
    }

    @Given("Sipariş menüsü altında Kapalı sekmesine tıkla")
    public void sipariş_menüsü_altında_kapalı_sekmesine_tıkla() {
        orderPage.orderPage_kapaliSection.click();

    }

    @Given("Kapalı sipariş listesinde kapatılan siparişin görünür olduğunu doğrula")
    public void kapalı_sipariş_listesinde_kapatılan_siparişin_görünür_olduğunu_doğrula() {

        ReusableMethods.bekle(2);
        Actions actions = new Actions(driver);
        ReusableMethods.jseClick(orderPage.OrderPage_filtreleriGosterGizle);

        ReusableMethods.bekle(1);

        String str = labelNo;
        int i = 0;
        while (i < str.length() && (Character.isLetter(str.charAt(i)) || str.charAt(i) == '0')) {
            i++;
        }
        labelNo = str.substring(i);
        orderPage.OrderPage_labelNoFilter.sendKeys(labelNo);
        String expectedValue = labelNo;
        ReusableMethods.bekle(2);
        actions.doubleClick(orderPage.orderPage_firstOrderLabelNo).perform();
        ReusableMethods.bekle(1);

        String str1 = orderPage.orderPage_firstOrderLabelNo.getText();
        int j = 0;
        while (j < str1.length() && (Character.isLetter(str1.charAt(j)) || str1.charAt(j) == '0')) {
            j++;
        }
        String actualLabelNo = str1.substring(j);


        Assert.assertEquals(actualLabelNo, expectedValue);
    }

    @Given("Siparişi iptal et sekmesine tıkla")
    public void siparişi_iptal_et_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        orderPage.orderPage_siparisiIptalEt.click();
    }

    @Given("Siparişi iptal et onay kutusunun göründüğünü doğrula")
    public void siparişi_iptal_et_onay_kutusunun_göründüğünü_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.getOrderPage_siparisIptalBox.isDisplayed());

    }

    @Given("İptal Et butonuna tıkla")
    public void i̇ptal_et_butonuna_tıkla() {
        orderPage.getOrderPage_siparisiIptalEt_iptalEtButton.click();

    }

    @Given("Tebrikler Siparişiniz Başarıyla İptal Edildi mesajının görünür olduğunu doğrula")
    public void tebrikler_siparişiniz_başarıyla_i̇ptal_edildi_mesajının_görünür_olduğunu_doğrula() {
        Assert.assertTrue(orderPage.getOrderPage_siparisinizBasariylaIptalEdildi_Message.isDisplayed());

    }


    @Given("İlk üç siparişi seç")
    public void i̇lk_üç_siparişi_seç() {

        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.orderPage_firstOrderSellectBox).perform();
        ReusableMethods.bekle(1);
        actions.click(orderPage.orderPage_secondOrderSellectBox).perform();
        ReusableMethods.bekle(1);
        actions.click(orderPage.orderPage_thirtOrderSellectBox).perform();
        ReusableMethods.bekle(1);


    }

    @Given("Toplu işlemler sekmesini tıkla")
    public void toplu_işlemler_sekmesini_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.getOrderPage_topluIslemlerSection).perform();


    }

    @Given("Açılan menüden Toplu Etiket Olustur sekmesine tıkla")
    public void açılan_menüden_toplu_etiket_olustur_sekmesine_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.getOrderPage_topluEtiketOlusturSection).perform();
        ReusableMethods.bekle(1);
    }

    @Given("Logout butonuna tıkla")
    public void logout_butonuna_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.getOrderPage_LogoutButton).perform();
        ReusableMethods.bekle(5);
    }

    @Given("Amazon Güncelleme butonuna tıkla")
    public void amazon_güncelleme_butonuna_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.getOrderPage_AmazonGuncellemeButton).perform();


    }

    @Given("Amazon.txt ile Veri Günceleme kutusunun açıldığını doğrula")
    public void amazon_txt_ile_veri_günceleme_kutusunun_açıldığını_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.OrderPage_AmazonGuncellemeBox.isDisplayed());

    }

    @Given("Dosya seç butonuna tıkla")
    public void dosya_seç_butonuna_tıkla() {
        Actions actions = new Actions(driver);
        actions.click(orderPage.OrderPage_AmazonGuncelleme_DosyaSecButton).perform();

    }

    @Given("Açılan pencerede ilgili dosyayı seç")
    public void açılan_pencerede_ilgili_dosyayı_seç() {
        String filePath = "D:\\INTELLIJ\\wisersell2_UI_Cucumber\\files\\amazon.txt";

        // Dosya var mı kontrol et
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Dosya bulunamadı: " + filePath);
            return;
        }

        // Hedef dosya yolunu belirle
        String targetDirectory = "D:\\INTELLIJ\\wisersell2_UI_Cucumber\\files\\";
        String targetFileName = "amazon.txt";

        // Dosyayı hedef dizine kopyala
        Path sourcePath = Paths.get(filePath);
        Path targetPath = Paths.get(targetDirectory, targetFileName);
        try {
            Files.copy(sourcePath, targetPath);
            System.out.println("Dosya başarıyla yüklendi: " + targetPath);
        } catch (Exception e) {
            System.out.println("Dosya yüklenirken bir hata oluştu: " + e.getMessage());
        }

        ReusableMethods.bekle(3);

    }

    @Given("Yükle butonuna tıkla")
    public void yükle_butonuna_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.OrderPage_AmazonGuncelleme_YukleButton).perform();
        ReusableMethods.bekle(1);


    }

    @Given("Kapat butonuna tıkla")
    public void kapat_butonuna_tıkla() {
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);
        actions.click(orderPage.orderStatusBox_KapatButton).perform();

    }

    @Given("Yükleme işleminin başarılı olduğu mesajının görünür olduğunu doğrula")
    public void yükleme_işleminin_başarılı_olduğu_mesajının_görünür_olduğunu_doğrula() {

    }

    @Given("Sipariş listesi üzerinde sipariş miktarının göründüğünü doğrula")
    public void sipariş_listesi_üzerinde_sipariş_miktarının_göründüğünü_doğrula() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderPage_topOrdeCount.isDisplayed());
    }

    @Given("Tam Ekran Değiştir simgesine tıkla")
    public void tam_ekran_değiştir_simgesine_tıkla() {
        orderPage.orderPage_fullScreenChange.click();
        ReusableMethods.bekle(1);

    }

    @Given("Sipariş listesinin tam ekran görünümünde olduğunu doğrula")
    public void sipariş_listesinin_tam_ekran_görünümünde_olduğunu_doğrula() {
        Assert.assertTrue(loginPage.loginPage_wisersellLogo.isDisplayed());

    }

    @Given("Satır sıklığını tıkla ve sırası ile tüm sıklık aşamalarının göründüğünü doğrula")
    public void satır_sıklığını_tıkla_ve_sırası_ile_tüm_sıklık_aşamalarının_göründüğünü_doğrula() {
        orderPage.orderPage_toggleDensityIcon.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderPage_toggleDensityIcon_small.isDisplayed());

        orderPage.orderPage_toggleDensityIcon.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderPage_toggleDensityIcon_large.isDisplayed());

        orderPage.orderPage_toggleDensityIcon.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(orderPage.orderPage_toggleDensityIcon_medium.isDisplayed());

    }

    @Given("Sutünları Göster Gizle sekmesine tıkla")
    public void sutünları_göster_gizle_sekmesine_tıkla() {
        orderPage.orderPage_sutunlariGosteGizle.click();
        ReusableMethods.bekle(1);
    }

    @Given("Sutünları Göster Gizle kutucuğunu kapat")
    public void sutünları_göster_gizle_kutucuğunu_kapat() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
        ReusableMethods.bekle(1);

    }


    @Given("Platform buttonuna tıkla")
    public void platform_buttonuna_tıkla() {
        orderPage.orderPage_sutunlariGosteGizle_platformButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("Palatform sutünunun kapandığını doğrula")
    public void palatform_sutünunun_kapandığını_doğrula() {

        //Assert.assertFalse(orderPage.orderPage_PlatformSection.isDisplayed());
    }

    @Given("Kargoya Hazır statüsüne tıkla")
    public void kargoya_hazır_statüsüne_tıkla() {
        orderPage.orderPage_kargoyaHazirStatus.click();
    }

    @Given("Sipariş menüsü altında Kargoya Hazır statüsünü tıkla")
    public void sipariş_menüsü_altında_kargoya_hazır_statüsünü_tıkla() {
        orderPage.orderPage_leftMenu_kargoyaHazirStatus.click();
    }

    @Given("İlgili kargonun bekleyen kargolar sayfasında göründüğünü doğrula")
    public void i̇lgili_kargonun_bekleyen_kargolar_sayfasında_göründüğünü_doğrula() {
        String expectedLabelNo = labelNo;
        ReusableMethods.bekle(1);
        Actions actions = new Actions(driver);


        orderPage.OrderPage_filtreleriGosterGizle.click();
        ReusableMethods.bekle(2);
        orderPage.orderPage_leftSetting_LabelFilterTextBox.sendKeys(expectedLabelNo);
        ReusableMethods.bekle(3);
        String actualLabelNo = shipmentPage.shipmendPage_bekleyenKargolar_firstOrderLabelNo.getText();
        System.out.println("Expected:" + expectedLabelNo);
        System.out.println("Actual:" + actualLabelNo);
        Assert.assertTrue(actualLabelNo.contains(expectedLabelNo));


    }
}
