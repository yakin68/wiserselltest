package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ShipmentPage;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class ShipmentCarrierRegionPrice {


    Actions actions = new Actions(driver);
    ShipmentPage shipmentPage = new ShipmentPage();


    String kargoHesabi = null;

    @Given("Bölge Fiyat Tanımlama sekmesine tıkla")
    public void bölge_fiyat_tanımlama_sekmesine_tıkla() {
        shipmentPage.shipmendPage_bolgeFiyatBelirleme.click();
    }

    @Given("Kargo hesabı kutucuğunu tıklayarak açılan drop down menüden kayıtlı bir kargo hesabı seç")
    public void kargo_hesabı_kutucuğunu_tıklayarak_açılan_drop_down_menüden_kayıtlı_bir_kargo_hesabı_seç() {
        shipmentPage.shipmendPage_bolgeFiyatBelirleme_kargoHesabiBox.click();
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bolgeFiyatBelirleme_kargoHesabiFirstSection.click();
    }

    @Given("Seçilen kargo hesabı bilgisimi kaydet")
    public void seçilen_kargo_hesabı_bilgisimi_kaydet() {

        kargoHesabi = shipmentPage.shipmendPage_bolgeFiyatBelirleme_kargoHesabiBox.getText();
        System.out.println("Bölg/fiyat seçilen kargo hesabı: " + kargoHesabi);

    }

    @Given("Excel ile Bölge Tanımlama butonuna tıkla")
    public void excel_ile_bölge_tanımlama_butonuna_tıkla() {
        shipmentPage.shipmendPage_bolgeFiyatBelirleme_excelBolgeTanimlama.click();
        ReusableMethods.bekle(2);
    }

    @Given("Excel İle Bölge Fiyat Tanımlama alanının açıldığını doğrula")
    public void excel_i̇le_bölge_fiyat_tanımlama_alanının_açıldığını_doğrula() {
        String expectedValue = "Excel İle Bölge Tanımlama";
        String actualValue = shipmentPage.shipmendPage_bolgeFiyatBelirleme_excelBolgeTanimlamaArea.getText();
        assertEquals(expectedValue, actualValue);
    }

    @Given("Firma kutucuğuna kaydedilen kargo hesabına kargo firmasını seç")
    public void firma_kutucuğuna_kaydedilen_kargo_hesabına_kargo_firmasını_seç() {
        shipmentPage.shipmendPage_bolgeFiyatTanımlama_excelBolgeTanimlamaFirma.click();
        ReusableMethods.bekle(1);
        String firma;
        if (kargoHesabi.contains("DHL")) {
            WebElement element = driver.findElement(By.xpath("//*[text()='DHL']"));
            element.click();

        } else if (kargoHesabi.contains("Fedex") || kargoHesabi.contains("FEDEX")) {
            WebElement element = driver.findElement(By.xpath("//*[text()='Fedex']"));
            element.click();
        } else if (kargoHesabi.contains("UPS")) {
            WebElement element = driver.findElement(By.xpath("//*[text()='UPS']"));
            element.click();
        }

    }

    @Given("Kargo kimliği kutucuğuna kaydedilen kargo hesabını seç")
    public void kargo_kimliği_kutucuğuna_kaydedilen_kargo_hesabını_seç() {
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bolgeTanımlama_excelBolgeTanimlamaKargoKimligi.click();
        ReusableMethods.bekle(2);
        String elementXpath="(//*[text()='" + kargoHesabi + "'])[2]";
        System.out.println("Kargo kimliği elementText: "+elementXpath);
        WebElement element = driver.findElement(By.xpath(elementXpath));
        ReusableMethods.bekle(1);
        element.click();

    }

    @Given("Dosaya seç butonuna tıkla")
    public void dosaya_seç_butonuna_tıkla() {
        //shipmentPage.shipmendPage_bolgeTanımlama_excelBolgeTanimlamaDosyaSec.click();

    }

    @Given("İlgili excell dosyasını seç")
    public void i̇lgili_excell_dosyasını_seç() throws AWTException {

        //Dosya yolunu bir objeye ata
        String projectPath = Paths.get("").toAbsolutePath().toString();
        System.out.println("Proje Yolu: " + projectPath);


        String dosyaYolu= projectPath+"\\files\\Kargo fiyat bölge.xlsx";
        ReusableMethods.bekle(1);

        // Robot sınıfını kullanarak dosya yükleme işlemi yapın
        shipmentPage.shipmendPage_bolgeTanımlama_excelBolgeTanimlamaDosyaSec.click();
        Robot robot = new Robot();
        robot.setAutoDelay(2000);

        // Dosya yolunu clipboard'a kopyalayın
        StringSelection stringSelection = new StringSelection(dosyaYolu);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Ctrl+V tuş kombinasyonunu kullanarak dosya yolunu yapıştırın
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Enter tuşuna basın
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Yükle butonuna bas
        ReusableMethods.bekle(1);
        shipmentPage.shipmendPage_bolgeTanımlama_excelBolgeTanimlamaYukleButton.click();
        ReusableMethods.bekle(2);

    }

    @Given("Tebrikler Dosya Yükleme Başarılı mesajının görünür olduğunu doğrula")
    public void tebrikler_dosya_yükleme_başarılı_mesajının_görünür_olduğunu_doğrula() {

        assertTrue(shipmentPage.shipmendPage_bolgeTanımlama_excelBolgeTanimlamaDosyaYuklemeIslemiBasarili.isDisplayed());

    }



}
