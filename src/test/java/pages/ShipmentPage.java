package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShipmentPage {


    public ShipmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Kargoya hazır sipariş sayfası "Kargo oluştur sekmesi"
    @FindBy(xpath = "//li[text()='Kargo Oluştur']")
    public WebElement shipment_kargoOlusturButton;

    //Kargoya hazır sipariş sayfası "Kargo oluştur" alanı-sayfası"
    @FindBy(xpath = "//h2[text()='Kargo Oluştur']")
    public WebElement shipment_kargoOlusturPage;

    //Kargo oluştur sayfası Boy kutucuğu
    @FindBy(xpath = "//input[@id='length']")
    public WebElement shipment_kargoOlusturPage_boy;

    //Kargo oluştur sayfası En kutucuğu
    @FindBy(xpath = "//input[@id='width']")
    public WebElement shipment_kargoOlusturPage_en;

    //Kargo oluştur sayfası Yükseklik kutucuğu
    @FindBy(xpath = "//input[@id='height']")
    public WebElement shipment_kargoOlusturPage_yukseklik;

    //Kargo oluştur sayfası Ağırlık kutucuğu
    @FindBy(xpath = "//input[@id='weight']")
    public WebElement shipment_kargoOlusturPage_agirlik;


    //Kargo oluştur sayfası Miktar kutucuğu
    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement shipment_kargoOlusturPage_miktar;

    //Kargo oluştur sayfası Tariff kutucuğu
    @FindBy(xpath = "//input[@id='tariff']")
    public WebElement shipment_kargoOlusturPage_tariff;

    //Kargo oluştur sayfası Fiyat Al sekmesi
    @FindBy(xpath = "//button[text()='Fiyat Al']")
    public WebElement shipment_kargoOlusturPage_fiyatAlButton;

    //Kargo oluştur sayfası Fiyat Al sekmesi altında "Özel fiyat bilgileri" ilk kargo şirketi
    @FindBy(xpath = "//div[3]/div/table/tbody/tr/td[1]")
    public WebElement shipment_kargoOlusturPage_fiyatAl_OzelFiyatBilgileri;

    //Kargo oluştur sayfası Fiyat Al sekmesi altında "Fiyat bilgileri" ilk kargo şirketi
    @FindBy(xpath = "//div[2]/div[2]/div/table/tbody/tr[1]/td[1]")
    public WebElement shipment_kargoOlusturPage_fiyatAl_fiyatBilgileri;


    //Kargo oluştur sayfası Para Birimi kutucuğu
    @FindBy(xpath = "//div[@id='currency']")
    public WebElement shipment_kargoOlusturPage_paraBirimi;


    //Kargo oluştur sayfası Para Birimi USD sekmesi
    @FindBy(xpath = "//li[text()='USD']")
    public WebElement shipment_kargoOlusturPage_paraBirimi_USD;


    //Kargo oluştur sayfası Göndeim Tipi
    @FindBy(xpath = "//div[@id='exportType']")
    public WebElement shipment_kargoOlusturPage_gonderimTipi;

    //Kargo oluştur sayfası Gönderim tipi kutucuğu_DAP seçeneği
    @FindBy(xpath = "//li[text()='DAP']")
    public WebElement shipment_kargoOlusturPage_gonderimTipi_DAP;

    //Kargo oluştur sayfası Tip kutucuğu
    @FindBy(xpath = "//div[@id='type']")
    public WebElement shipment_kargoOlusturPage_Tip;

    //Kargo oluştur sayfası Tip kutucuğu_VAT sekmesi
    @FindBy(xpath = "//li[text()='VAT']")
    public WebElement shipment_kargoOlusturPage_Tip_VAT;

    //Kargo oluştur sayfası Kargo ücreti kutucuğu
    @FindBy(xpath = "//input[@id='shipmentPrice']")
    public WebElement shipment_kargoOlusturPage_kargoUcreti;


    //Kargo oluştur sayfası VAT/IOSS kutucuğu
    @FindBy(xpath = "//input[@id='vatioss']")
    public WebElement shipment_kargoOlusturPage_vatioss;


    //Kargo oluştur sayfası amac kutucuğu
    @FindBy(xpath = "//div[@id='purpose']")
    public WebElement shipment_kargoOlusturPage_amac;

    //Kargo oluştur sayfası amac kutucuğu_ilk seçenek
    @FindBy(xpath = "//div/div[3]/ul/li[1]")
    public WebElement shipment_kargoOlusturPage_amac_firstSection;

    //Kargo oluştur sayfası gümrük bedeli
    @FindBy(xpath = "//input[@id='customsPrice']")
    public WebElement shipment_kargoOlusturPage_gumrukBedeli;


    //Kargo oluştur sayfası kayıt sonrası Kargo Başarıyla Oluşturuldu mesajı
    @FindBy(xpath = "//div[text()='Kargo Başarıyla Oluşturuldu']")
    public WebElement shipment_kargoBasariylaOlusturuldu;

    //Sol menü barında Kargo sekmesi
    @FindBy(xpath = "//span[text()='Kargo']")
    public WebElement shipment_leftMenu_KargoSection;

    //Sol menü barında Kargo sekmesi_Bekleyen kargolar
    @FindBy(xpath = "//span[text()='Bekleyen']")
    public WebElement shipment_leftMenu_Kargo_bekleyenKargolar;


    //kargo bekleyen katgolar sipariş listesinde ilk siparişe ait "Label No"
    @FindBy(xpath = "//table/tbody/tr[1]/td[6]")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderLabelNo;

    //OrderPage'de sipariş listesinde ilk siparişe kargo logo
    @FindBy(xpath = "//tr[1]/td[2]")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderShipmentLogo;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur
    @FindBy(xpath = "//li[text()='Kargo Etiketi Oluştur']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde ilk kargo profili
    @FindBy(xpath = "(//input)[1]")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_kargoProfil;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde yazıcı tipi
    @FindBy(xpath = "//div[@id='printer']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde paket tipi
    @FindBy(xpath = "//*[@id='packageType']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_paketTipi;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde paket tipi
    @FindBy(xpath = "//*[text()='YOUR PACKAGING']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_paketTipi_first;


    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde yazıcı tipi_Termal
    @FindBy(xpath = "//li[@data-value='Thermal']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_yaziciTipi_termal;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kartgo etiketi oluştur kutucuğu içinde paket tipi ilk seçenek
    @FindBy(xpath = "//div[7]/div[3]/ul/li[1]")
    public WebElement shipmendPage_bekleyenKargolar_firstOrderKargoEtiketiOlustur_paketTipi_ilkSecenek;


    //Bekleyen kargolar listesinde işlemler sekmesi altında Kargo Gönder
    @FindBy(xpath = "//li[text()='Kargo Gönder']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrder_kargoGonder;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kargo Gönder kutucuğu
    @FindBy(xpath = "//h2[text()='Kargo Gönder']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrder_kargoGonderBox;

    //Bekleyen kargolar listesinde işlemler sekmesi altında Kargo Gönder kutucuğu içinde gönder butonu
    @FindBy(xpath = "//button[text()='Gönder']")
    public WebElement shipmendPage_bekleyenKargolar_firstOrder_kargoGonderBox_gonderButton;

    //Bekleyen kargolar alanında Tebrikler Kargonuz Gönderildi mesajı
    @FindBy(xpath = "//div[text()='Kargonuz Gönderildi']")
    public WebElement shipmendPage_bekleyenKargolar_tebriklerKargonuzGonderildi;

    //Sol menü barında Gönderilmiş kargolar
    @FindBy(xpath = "//span[text()='Gönderilmiş']")
    public WebElement shipmendPage_gonderilmisKargolar;

    //Sol menü barında Gönderilmiş kargolar ilk sipariş alıcı name
    @FindBy(xpath = "//table/tbody/tr[1]/td[4]")
    public WebElement shipmendPage_gonderilmisKargolar_firstName_AliciAdi;

    //Sol taraf Kargo menüsü altında Gönderilmiş Kargolar sayfası Alıcı Filtresi Text kutusu
    @FindBy(xpath = "//input[@placeholder='Alıcı Filtresi']")
    public WebElement gönderilmisKargolar_aliciFilterTextBox;


    //Sol menü barında Bölge/Fiyat tanımlama
    @FindBy(xpath = "//span[text()='Bölge/Fiyat Tanımlama']")
    public WebElement shipmendPage_bolgeFiyatBelirleme;

    //Bölge/Fiyat belirleme sayfası Kargo hesabı kutucuğu
    @FindBy(xpath = "//div[@id='region']")
    public WebElement shipmendPage_bolgeFiyatBelirleme_kargoHesabiBox;

    //Bölge/Fiyat belirleme sayfası Kargo hesabı dropdown menü ilk seçenek
    @FindBy(xpath = "//div[5]/div[3]/ul/li[1]")
    public WebElement shipmendPage_bolgeFiyatBelirleme_kargoHesabiFirstSection;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama
    @FindBy(xpath = "//button[text()='Excel ile Bölge Tanımla']")
    public WebElement shipmendPage_bolgeFiyatBelirleme_excelBolgeTanimlama;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama
    @FindBy(xpath = "//h2")
    public WebElement shipmendPage_bolgeFiyatBelirleme_excelBolgeTanimlamaArea;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama Firma Kutucuğu
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[2]")
    public WebElement shipmendPage_bolgeFiyatTanımlama_excelBolgeTanimlamaFirma;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama Kargo kimliği kutucuğu
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[3]")
    public WebElement shipmendPage_bolgeTanımlama_excelBolgeTanimlamaKargoKimligi;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama Dosya seç
    @FindBy(xpath = "//*[text()='Dosya Seç']")
    public WebElement shipmendPage_bolgeTanımlama_excelBolgeTanimlamaDosyaSec;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama Yükle butonu
    @FindBy(xpath = "//*[text()='Yükle']")
    public WebElement shipmendPage_bolgeTanımlama_excelBolgeTanimlamaYukleButton;

    //Bölge/Fiyat belirleme sayfası Excel ile Bölge tanımlama alanı "Tebrişkler Dosya  Yükleme işlemi Başarılı" mesajı
    @FindBy(xpath = "//*[text()='Dosya Yükleme Başarılı']")
    public WebElement shipmendPage_bolgeTanımlama_excelBolgeTanimlamaDosyaYuklemeIslemiBasarili;

    //Kargo=> Standart Desi sekmesi
    @FindBy(xpath = "//*[text()='Standart Desi']")
    public WebElement shipmendPage_standartDesiButton;

    //Kargo=> Standart Desi sayfası Standart Desi oluştur butonu
    @FindBy(xpath = "//*[text()='Standart Desi Oluştur']")
    public WebElement shipmendPage_standartDesi_standartDesiOlusturButton;

    //Kargo=> Standart Desi sayfası Standart Desi oluştur alanı
    @FindBy(xpath = "//h2")
    public WebElement shipmendPage_standartDesi_standartDesiOlusturPage;

    //Kargo=> Standart Desi sayfası Standart Desi oluştur isim kutucuğu
    @FindBy(xpath = "//input[@id='name']")
    public WebElement shipmendPage_standartDesi_standartDesiOlusturButton_isim;


    //Kargo=> Standart Desi sayfası "Tebrikler başarıyla kaydedildi" mesajı"
    @FindBy(xpath = "//*[text()='Başarıyla Kaydedildi']")
    public WebElement shipmendPage_standartDesi_basariylaKaydedildiMessage;

    //Kargo=> Standart Desi listesi isim fitreleme textBox
    @FindBy(xpath = "//input[@placeholder='isim Filtresi']")
    public WebElement shipmendPage_standartDesi_nameFilterBox;

    //Kargo=> Standart Desi listesi ilk desiye ait isim alanı
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public WebElement shipmendPage_standartDesi_firstDeciName;

   //Kargo=> Standart Desi listesi ilk desiye işlemler (...) sekmesi
    @FindBy(xpath = "//button[@aria-label='Satır İşlemleri']")
    public WebElement shipmendPage_standartDesi_firstDeci_islemler;


  //Kargo=> Standart Desi listesi ilk desiye işlemler (...) sekmesi altında sil butonu
    @FindBy(xpath = "//*[text()='Sil']")
    public WebElement shipmendPage_standartDesi_firstDeci_islemler_sil;

  //Kargo=> Standart Desi listesi standart desi sil onay kutusu
    @FindBy(xpath = "//*[text()='Standart Desi Sil']")
    public WebElement shipmendPage_standartDesi_silOnayKutusu;

  //Kargo=> Standart Desi listesi standart desi sil onay kutusu evet butonu
    @FindBy(xpath = "//*[text()='Evet']")
    public WebElement shipmendPage_standartDesi_silOnayKutusu_evetButonu;

  //Kargo=> Standart Desi listesi standart desi alanaı "Tebrikler ... numaralı desi başarıyla silindi" mesaj kutusu
    @FindBy(xpath = "//*[text()='Tebrikler']")
    public WebElement shipmendPage_standartDesi_tebriklerMessageBox;






}
