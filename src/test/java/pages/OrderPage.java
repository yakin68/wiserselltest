package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderPage {


    public OrderPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //OrderPage sol menü sipariş sekmesi
    @FindBy(xpath = "//span[text()='Sipariş']")
    public WebElement orderPage_siparisSection;


    //OrderPage sol menü sipariş sekmesi altında açık sekmesi
    @FindBy(xpath = "//span[text()='Açık']")
    public WebElement orderPage_acikSection;

    //OrderPage'de sipariş listesinin üst kısmında "Alıcı" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Alıcı']")
    public WebElement orderPage_aliciSection;

    //OrderPage'de sipariş listesinin üst kısmında "Sipariş Ayrıntıları" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Sipariş Ayrıntıları']")
    public WebElement orderPage_siparisAyrintilariSection;

    //OrderPage'de sipariş listesinin üst kısmında "Servis Seviyesi" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Servis Seviyesi']")
    public WebElement orderPage_servisSeviyesiSection;

    //OrderPage'de sipariş listesinin üst kısmında "Sipariş No" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Sipariş No']")
    public WebElement orderPage_siparisNoSection;


    //OrderPage'de sipariş listesinin üst kısmında "Sipariş Tarihi" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Sipariş Tarihi']")
    public WebElement orderPage_siparisTarihiSection;

    //OrderPage'de sipariş listesinin üst kısmında "Ülke" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Ülke']")
    public WebElement orderPage_ulkeSection;

    //OrderPage'de sipariş listesinin üst kısmında "Sipariş Sayfası Bilgileri" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Sipariş Sayfası Bilgileri']")
    public WebElement orderPage_siparisBilgileriText;

    //OrderPage'de sipariş listesinin üst kısmında "İşlemler" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='İşlemler']")
    public WebElement orderPage_islemlerSection;

    //OrderPage'de sipariş listesinin üst kısmında "Platform" sütununun başlık kısmı
    @FindBy(xpath = "//p[text()='Platform']")
    public WebElement orderPage_PlatformSection;

    //OrderPage'de sipariş listesinin üst kısmında "Label No" sütununun başlık kısmı
    @FindBy(xpath = "//*[text()='Label No']")
    public WebElement orderPage_labelNoSection;

    //OrderPage'de sipariş listesinin üst kısmında "Tümünü Seç" kutucuğu
    @FindBy(xpath = "//span[@aria-label='Tümünü Seç']")
    public WebElement orderPage_tumunuSec;

    //OrderPage'de sipariş listesinin üst kısmında "Aramayı Göster/Gizle" search simgesi
    @FindBy(xpath = "//button[@aria-label='Aramayı Göster/Gizle']")
    public WebElement orderPage_searchButton;

    //OrderPage'de sipariş listesinin üst kısmında Search arama kutusu
    @FindBy(xpath = "//*[@autocomplete='new-password']")
    public WebElement orderPage_searchTextBox;

    //OrderPage'de sipariş listesinin üst kısmında "Aramayı Temizle" search "X" simgesi
    @FindBy(xpath = "//button[@aria-label='Aramayı Temizle']")
    public WebElement orderPage_searchClearXbutton;

    //OrderPage'de sipariş listesinde ilk siparişe ait "Label No"
    @FindBy(xpath = "//tr[1]/td[4]")
    public WebElement orderPage_firstOrderLabelNo;

    //OrderPage'de sipariş listesinde ilk siparişe ait "alici"
    @FindBy(xpath = "//tr[1]/td[6]")
    public WebElement orderPage_firstOrderAliciName;


    //OrderPage'de sipariş listesinde ilk siparişe ait "işlemler (...) "
    @FindBy(xpath = "//tr[1]/td[1]/button")
    public WebElement orderPage_firstOrderIslemler;

    //OrderPage'de sipariş listesinde ilk siparişe ait "Sipariş No"
    @FindBy(xpath = "//tr[1]/td[5]")
    public WebElement orderPage_firstOrderSiparisNo;

    //OrderPage'de sipariş listesinde ilk siparişe ait "Alıcı"
    @FindBy(xpath = "//tr[1]/td[6]")
    public WebElement orderPage_firstOrderAlici;

    //OrderPage'de sipariş listesinde ilk siparişe ait "Sipariş Ayrıntıları_Kisilestirme"
    @FindBy(xpath = "//tr[1]/td[7]/div/div/div/p[3]")
    public WebElement orderPage_firstOrderSiparisAyrintilari_Kisilestirme;


    //OrderPage'de tümünü seç tıklandıktan sonra göeünen uyarı mesajı
    @FindBy(xpath = "//div[@class='MuiStack-root css-149sczi']")
    public WebElement orderPage_tumunuSecMessageText;

    //OrderPage'de tümünü seç tıklandıktan sonra göeünen "Seçimi Temizle" sekmesi
    @FindBy(xpath = "//*[text()='Seçimi Temizle']")
    public WebElement orderPage_secimiTemizle;


    //OrderPage'de sipariş listesinde ilk siparişe ait "seçici kutu"
    @FindBy(xpath = "//tr[1]/td[2]/span/input")
    public WebElement orderPage_firstOrderSellectBox;

    //OrderPage'de sipariş listesinde ikinci siparişe ait "seçici kutu"
    @FindBy(xpath = "//tr[2]/td[2]/span/input")
    public WebElement orderPage_secondOrderSellectBox;

    //OrderPage'de sipariş listesinde üçüncü siparişe ait "seçici kutu"
    @FindBy(xpath = "//tr[3]/td[2]/span/input")
    public WebElement orderPage_thirtOrderSellectBox;


    //OrderPage'de "Ürün Listesi"" sekmesi
    @FindBy(xpath = "//*[text()='Ürün Listesi']")
    public WebElement orderPage_urunListesiSection;

    //OrderPage'de "Siparişleri Yenile" sekmesi
    @FindBy(xpath = "//*[text()='Siparişleri Yenile']")
    public WebElement orderPage_siparisleriYenileSection;

    //OrderPage'de "Siparişleriniz Yenileme" kutusu
    @FindBy(xpath = "//h2[text()='Sipariş Yenileme']")
    public WebElement orderPage_siparisYenilemeBox;

    //OrderPage'de "Sipariş Yenileme işlemi başarıyla tamamlandı" mesaj kutusu
    @FindBy(xpath = "//*[text()='Sipariş Yenileme işlemi başarıyla tamamlandı.']")
    public WebElement orderPage_siparislerYenilendiMessageBox;

    //OrderPage'de  siparişe ait işlemler sekmesi altında "Detay Gör" sekmesi
    @FindBy(xpath = "//*[text()='Detay Gör']")
    public WebElement orderPage_detayGor;

    //OrderPage sipariş yenileme ekranı "Taqmam" butonu
    @FindBy(xpath = "//*[text()='Tamam']")
    public WebElement orderPage_tamamButton;


    //OrderPage'de  siparişe ait işlemler sekmesi altında "Durum Değiştir" sekmesi
    @FindBy(xpath = "//*[text()='Durum Değiştir']")
    public WebElement orderPage_durumDegistir;

    //OrderPage'de  siparişe ait işlemler sekmesi altında "Etiket Olustur" sekmesi
    @FindBy(xpath = "//*[text()='Etiket Oluştur']")
    public WebElement orderPage_etiketOlustur;

    //OrderPage'de  siparişe ait işlemler sekmesi altında "Harici Gönderim Kapama" sekmesi
    @FindBy(xpath = "//*[text()='Harici Gönderim Kapama']")
    public WebElement orderPage_hariciGonderimKapama;

    //OrderPage'de  siparişe ait işlemler sekmesi altında "Sipariş İptal Et" sekmesi
    @FindBy(xpath = "//*[text()='Siparişi İptal Et']")
    public WebElement orderPage_siparisiIptalEt;

    //OrderPage'de  siparişe ait işlemler sekmesi altında "Kargo Olustur" sekmesi
    @FindBy(xpath = "//*[text()='Kargo Oluştur']")
    public WebElement orderPage_kargoOlustur;

    //Detay Gör sayfasında Alıcı Bilgileri düzenleme sekmesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-1flaugw'])[1]")
    public WebElement orderDetail_aliciBilgileriEditIcon;

    //Detay Gör sayfasında Alıcı Bilgileri "Alıcı"düzenleme kutusu
    @FindBy(xpath = "//*[@id=\"receiver\"]")
    public WebElement orderDetail_aliciBilgileriAliciTextBox;

    //Detay Gör sayfasında Alıcı Bilgileri "Alıcı" satırı
    @FindBy(xpath = "(//label[@class='MuiTypography-root MuiTypography-subtitle2 css-j3nckz'])[1]")
    public WebElement orderDetail_aliciBilgileriAliciLine;

    //Detay Gör sayfasında Fatura bilgileri alanına geçiş için Fatura bilgileri butonu
    @FindBy(xpath = "//button[@id='simple-tab1-1']")
    public WebElement orderDetail_faturaBilgileri_button;


    //Detay Gör sayfasında Alıcı Bilgileri düzenleme "onay" sekmesi
    @FindBy(xpath = "//div[1]/div/div/div[1]/div[2]/button[1]")
    public WebElement orderDetail_aliciBilgileriCheckTick;

    //Detay Gör sayfasında Fatura Bilgileri düzenleme "adres" satırı
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-9 css-14r7kto']")
    public WebElement orderDetail_FaturaBilgileriAdressLine;


    //Detay Gör sayfasında Fatura Bilgileri düzenleme "onay" sekmesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yhx7lq'])[8]")
    public WebElement orderDetail_faturaBilgileriCheckTick;


    //Detay Gör sayfasında "Tebrikler Kaydedildi" kutusu
    @FindBy(xpath = "//h2")
    public WebElement orderDetail_tebriklerKaydedildiBox;


    //Detay Gör sayfasında Fatura Bilgileri düzenleme sekmesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-1flaugw'])[1]")
    public WebElement orderDetail_faturaBilgileriEditIcon;

    //Detay Gör sayfasında Fatura Bilgileri düzenleme sekmesi Adres düzenleme alanı
    @FindBy(xpath = "//*[@id='address']")
    public WebElement orderDetail_faturaBilgileriAdressTextBox;


    //Detay Gör sayfasında Notlar alanı düzenleme sekmesi
    @FindBy(xpath = "//button[@aria-label='notes dialog']")
    public WebElement orderDetail_notlarEditIcon;

    //Detay Gör sayfasında Notlar alanı düzenleme Kullanıcı notu alanı
    @FindBy(xpath = "//input[@placeholder='User Note']")
    public WebElement orderDetail_notlarkullaniciNotuTextBox;

    //Detay Gör sayfasında Notlar alanı düzenleme Kullanıcı notu satırı
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-9 MuiGrid-grid-lg-9 css-14r7kto']")
    public WebElement orderDetail_notlarkullaniciNotuLine;

    //Detay Gör sayfasında Notlar alanı düzenleme onay tik
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yhx7lq'])[8]")
    public WebElement orderDetail_NotlarCheckTick;


    //Detay Gör sayfasında kisilestirme alanı düzenleme sekmesi
    @FindBy(xpath = "//tr/td[5]/button[@aria-label='delivery dialog']")
    public WebElement orderDetail_kisilestirmeEditIcon;

    //Detay Gör sayfasında kisilestirme alanı düzenleme satırı
    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-1pqamd2']")
    public WebElement orderDetail_kisilestirmetextBox;

    //Detay Gör sayfasında kisilestirme satırı
    @FindBy(xpath = "//*[@id=\"simple-tabpanel-0\"]/div/div/table/tbody/tr/td[5]/div")
    public WebElement orderDetail_kisilestirmeLine;


    //Detay Gör sayfasında kisilestirme onay tik
    @FindBy(xpath = "//*[@id='simple-tabpanel-0']/div/div/table/tbody/tr/td[5]/div[2]/button[1] ")
    public WebElement orderDetail_kisilestirmeCheckTick;

    //Detay Gör sayfasında labelNo alanı
    @FindBy(xpath = "//h1")
    public WebElement orderDetail_LabelNo;

    //Detay Gör sayfasında Kapat 2.button
    @FindBy(xpath = "(//button[text()='Kapat'])[2]")
    public WebElement orderDetail_Kapat2;

    //Detay Gör sayfasında Kapat 2.button
    @FindBy(xpath = "//h2")
    public WebElement orderPage_DurumDegistirBox;

    //==================Order Detail_Customer Info=============

    //Detay Gör altında müşteri bilgileri sekmesi
    @FindBy(xpath = "//*[text()='Müşteri Bilgileri']")
    public WebElement orderDetail_musteriBilgileriSekmesi;

    //Detay Gör altında müşteri bilgileri_name
    @FindBy(xpath = "//*[@id=\"simple-tabpanel2-1\"]/div/div/div/div/div[2]/div[2]")
    public WebElement orderDetail_musteriBilgileri_name;

    //Detay Gör altında müşteri bilgileri_email
    @FindBy(xpath = "//*[@id=\"simple-tabpanel2-1\"]/div/div/div/div/div[2]/div[6]")
    public WebElement orderDetail_musteriBilgileri_email;

    //Detay Gör altında müşteri bilgileri_adres full
    @FindBy(xpath = "//*[@id=\"simple-tabpanel2-1\"]/div/div/div/div/div[2]/div[4]")
    public WebElement orderDetail_musteriBilgileri_fullAdress;

    //Detay Gör altında müşteri bilgileri_telefon
    @FindBy(xpath = "//*[@id=\"simple-tabpanel2-1\"]/div/div/div/div/div[2]/div[8]")
    public WebElement orderDetail_musteriBilgileri_phone;


    //=============================================================


    //Sipariş status değiştirme kutusu Kaydet butonu
    @FindBy(xpath = "//nav/div[2]/div[2]")
    public WebElement orderStatusBox_FirstStatus;

    //Sipariş status değiştirme kutusu ilk statü
    @FindBy(xpath = "//button[text()='Kaydet']")
    public WebElement orderStatusBox_KaydetButton;

    //Sipariş status değiştirme kutusu Kapat
    @FindBy(xpath = "//*[text()='Kapat']")
    public WebElement orderStatusBox_KapatButton;


    //Sipariş status değiştirme sonrası Tebrikler mesajı
    @FindBy(xpath = "//*[text()='Tebrikler']")
    public WebElement orderStatus_TebriklerMessage;

    //Sipariş menüsü altında ilk statü
    @FindBy(xpath = "//ul/div/div/div/li[2]")
    public WebElement orderMenu_FirstState;

    //Sol menü barında "Ayarlar" sekmesi
    @FindBy(xpath = "//*[text()='Ayarlar']")
    public WebElement orderPage_AyarlarSection;

    //Sol menü barında Ayarlar altında "Operasyonel Statüler" sekmesi
    @FindBy(xpath = "//*[text()='Operasyonel Statüler']")
    public WebElement orderSetting_OperasyonelStatulerSection;

    //Sol menü barında Ayarlar altında "Operasyonel Statüler" sekmesi altında "Statü Ekle" butonu
    @FindBy(xpath = "//*[text()='Statü Ekle']")
    public WebElement orderSetting_OperasyonelStatuler_StatuEkleButton;

    //Sol menü barında Ayarlar altında "Operasyonel Statüler" sekmesi altında satatu ekleme textBox
    @FindBy(xpath = "//input[@id='name']")
    public WebElement orderSetting_OperasyonelStatuler_StatuAdiTextBox;

    //Sol menü barında Ayarlar altında "Operasyonel Statüler" sekmesi altında eklenen statu
    @FindBy(xpath = "//*[text()='TestAutomation']")
    public WebElement orderSetting_OperasyonelStatuler_TestAutomationStatus;


    //Sol menü barında Ayarlar altında "Operasyonel Statüler" sekmesi altında "Tebrikler statü silindi" mesajı"
    @FindBy(xpath = "//*[text()='Status silindi']")
    public WebElement orderSetting_OperasyonelStatuler_TebrklerStatusSilindi;

    //Etket oluştur tıklanınca açılan kutucuk "Termal Etiket Düzeni" radio butonu
    @FindBy(xpath = "//*[@id='1']")
    public WebElement orderSetting_createLabel_TermalEtiketDuzeni;

    //Etket oluştur tıklanınca açılan kutucuk "Ürün Bazlı A4 Etiket Düzeni" radio butonu
    @FindBy(xpath = "//*[@id='2']")
    public WebElement orderSetting_createLabel_UrunBazliA4EtiketDuzeni;

    //Etket oluştur tıklanınca açılan kutucuk "Sipariş Bazlı A4 Etiket Düzeni" radio butonu
    @FindBy(xpath = "//*[@id='3']")
    public WebElement orderSetting_createLabel_SiparisbazliA4EtiketDuzeni;


    //Etket oluştur tıklanınca açılan kutucuk "Etiket Al"  butonu
    @FindBy(xpath = "//*[text()='Etiket Al']")
    public WebElement orderSetting_createLabel_EtiketAlButton;


    //Etket oluştur tıklanınca açılan kutucuk "Kapat"  butonu
    @FindBy(xpath = "//*[text()='Kapat']")
    public WebElement orderSetting_createLabel_KapatButton;


    //Harici Sipariş kapama alanı
    @FindBy(xpath = "//*[text()='Harici Sipariş Kapama']")
    public WebElement externalOrderCloseBox;

    //Harici Sipariş kapama alanı Boy kutucuğu
    @FindBy(xpath = "//*[@id='length']")
    public WebElement externalOrderCloseBox_boyTextBox;

    //Harici Sipariş kapama alanı En kutucuğu
    @FindBy(xpath = "//*[@id='width']")
    public WebElement externalOrderCloseBox_enTextBox;

    //Harici Sipariş kapama alanı Yükseklik kutucuğu
    @FindBy(xpath = "//*[@id='height']")
    public WebElement externalOrderCloseBox_yukseklikTextBox;

    //Harici Sipariş kapama alanı Ağırlık kutucuğu
    @FindBy(xpath = "//*[@id='weight']")
    public WebElement externalOrderCloseBox_agirlikTextBox;


    //Harici Sipariş kapama alanı Miktar kutucuğu
    @FindBy(xpath = "//*[@id='quantity']")
    public WebElement externalOrderCloseBox_miktarTextBox;

    //Harici Sipariş kapama alanı Kargo Firması kutucuğu
    @FindBy(xpath = "//*[@id='carrier'] ")
    public WebElement externalOrderCloseBox_kargoFirmasiTextBox;

    //Harici Sipariş kapama alanı Kargo Firması altında 1. kargo firmsaı kutucuğu
    @FindBy(xpath = "//*[@role='listbox']/li[1]")
    public WebElement externalOrderCloseBox_kargoFirmasi_firstSection;

    //Harici Sipariş kapama Siparişiniz Başarıyla Kapatıldı kutucuğu
    @FindBy(xpath = "//*[text()='Siparişiniz Başarıyla Kapatıldı']")
    public WebElement externalOrderClose_tebriklerSiparisnizBasariylaKapatildi;

    //Sipariş altında Açık sekmesi altında Kapalı sekmesi
    @FindBy(xpath = "//*[text()='Kapalı']")
    public WebElement orderPage_kapaliSection;

    //Sipariş altında Açık sekmesi altında Siparisi İptal et kutucuğu altında "İptal Et" butonu
    @FindBy(xpath = "//*[text()='İptal Et']")
    public WebElement getOrderPage_siparisiIptalEt_iptalEtButton;

    //Sipariş iptal işlemi sonraki"Siparişiniz Başarıyla İptal Edildi" mesajı
    @FindBy(xpath = "//*[text()='Siparişiniz Başarıyla İptal Edildi']")
    public WebElement getOrderPage_siparisinizBasariylaIptalEdildi_Message;

    //Sipariş iptal işlemi kutucuğu
    @FindBy(xpath = "//h2[text()='Siparişi İptal Et']")
    public WebElement getOrderPage_siparisIptalBox;

    //Toplu islemler sekmesi
    @FindBy(xpath = "//button[text()='Toplu İşlemler']")
    public WebElement getOrderPage_topluIslemlerSection;

    //Profil simgesi altında Logout sekmesi
    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement getOrderPage_LogoutButton;

    //Sipariş sayfasında Amazon Güncelleme butonu
    @FindBy(xpath = "//button[text()='Amazon Güncelleme']")
    public WebElement getOrderPage_AmazonGuncellemeButton;


    //Toplu Etiket Oluştur sekmesi
    @FindBy(xpath = "//*[text()='Toplu Etiket Oluştur']")
    public WebElement getOrderPage_topluEtiketOlusturSection;

    //Amazon sipariş güncelleme kutucuğu içinde Dosya Seç butonu
    @FindBy(xpath = "//*[text()='Dosya Seç']")
    public WebElement OrderPage_AmazonGuncelleme_DosyaSecButton;

    //Amazon sipariş güncelleme kutucuğu içinde Yükle butonu
    @FindBy(xpath = "//button[text()='Yükle']")
    public WebElement OrderPage_AmazonGuncelleme_YukleButton;


    //Amazon sipariş güncelleme kutucuğu
    @FindBy(xpath = "//*[text()='Amazon.txt ile Veri Günceleme']")
    public WebElement OrderPage_AmazonGuncellemeBox;


    //Sipariş sayfası Filtreleri Göster/Gizle
    @FindBy(xpath = "//button[@aria-label='Filtreleri Göster/Gizle']")
    public WebElement OrderPage_filtreleriGosterGizle;

    //Sipariş sayfası Filtreleri Göster/Gizle _ Label No Filtresi
    @FindBy(xpath = "//input[@placeholder='Label No Filtresi']")
    public WebElement OrderPage_labelNoFilter;


    //Sipariş sayfası üst sipariş sayısı
    @FindBy(xpath = "//div[1]/h6/span")
    public WebElement orderPage_topOrdeCount;

    //Sipariş sayfası alt sipariş sayısı
    @FindBy(xpath = "//div/p/text()[4]")
    public WebElement orderPage_downOrdeCount;

    //Sipariş sayfası Tam ekran değiştir butonu
    @FindBy(xpath = "//button[@aria-label='Tam Ekranı Değiştir']")
    public WebElement orderPage_fullScreenChange;

    //Sol taraf Ayarlar menüsü altında Kullanıcı sekmesi
    @FindBy(xpath = "//span[text()='Kullanıcı']")
    public WebElement orderPage_leftSetting_UserButton;

    //Sol taraf Ayarlar menüsü altında Kullanıcı sayfası Name Filtresi Text kutusu
    @FindBy(xpath = "//input[@placeholder='Name Filtresi']")
    public WebElement orderPage_leftSetting_nameFilterTextBox;

    //Sol taraf Ayarlar menüsü altında Kullanıcı sayfası Label Filtresi Text kutusu
    @FindBy(xpath = "//input[@placeholder='Label No Filtresi']")
    public WebElement orderPage_leftSetting_LabelFilterTextBox;


    //Sol taraf Ayarlar menüsü altında Kullanıcı sayfası Delete butonu
    @FindBy(xpath = "//*[text()=' Delete']")
    public WebElement orderPage_userPage_deleteButton;

    //Sol taraf Ayarlar menüsü altında Kullanıcı sayfası sil butonu
    @FindBy(xpath = "//button[text()='Sil']")
    public WebElement orderPage_userPage_silButton;

    //Sol taraf Ayarlar menüsü altında Kullanıcı sayfası ilk satır name kutucuğu
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement orderPage_userPage_firstUserLineNameBox;


    //Sipariş sayfası sıklığı değiştir simgesi
    @FindBy(xpath = "//button[@aria-label='Sıklığı Değiştir']")
    public WebElement orderPage_toggleDensityIcon;

    //Sipariş sayfası sıklığı değiştir "Medium"
    @FindBy(xpath = "//*[@class='tabler-icon tabler-icon-baseline-density-medium ']")
    public WebElement orderPage_toggleDensityIcon_medium;

    //Sipariş sayfası sıklığı değiştir "small"
    @FindBy(xpath = "//*[@class='tabler-icon tabler-icon-baseline-density-small ']")
    public WebElement orderPage_toggleDensityIcon_small;

    //Sipariş sayfası sıklığı değiştir "large"
    @FindBy(xpath = "//*[@class='tabler-icon tabler-icon-baseline-density-large ']")
    public WebElement orderPage_toggleDensityIcon_large;

    //Sipariş sayfası sütunlari gizle/ göster simgesi
    @FindBy(xpath = "//button[@aria-label='Sütunları Göster/Gizle']")
    public WebElement orderPage_sutunlariGosteGizle;

    //Sipariş sayfası sütunlari gizle/ göster altında platform seçici button
    @FindBy(xpath = "//li[3]/div/label/span[1]/span[1]/input")
    public WebElement orderPage_sutunlariGosteGizle_platformButton;

    //Sipariş sayfası sol menüde Açık siparişler altında Kargoya Hazır statüsü
    @FindBy(xpath = "//span[text()='Kargoya Hazır']")
    public WebElement orderPage_leftMenu_kargoyaHazirStatus;

    //Statü değiştirme kutucuğu içinde altında Kargoya Hazır statüsü
    @FindBy(xpath = "(//span[text()='Kargoya Hazır'])[2]")
    public WebElement orderPage_kargoyaHazirStatus;


}
