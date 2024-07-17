package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage () {

        PageFactory.initElements(Driver.getDriver(), this);
}

    //   Urun Butonu
    @FindBy(xpath = "(//*[text()='Ürün'])[1]")
    public WebElement urunButonu;


    //    Urun Listesi Butonu
    @FindBy(xpath = "(//*[text()='Ürün Listesi'])[1]")
    public WebElement urunListesiButonu;

//    Urun Kategorileri Butonu

    @FindBy(xpath = "//*[text()='Ürün Kategorileri']")
    public WebElement urunKategorileriButonu;

    //    Urun Olustur Butonu
    @FindBy(xpath = "//*[text()='Ürün Oluştur']")
    public WebElement urunOlusturButonu;

    //      Urun Olustur Sayfasinin Gorunurlugu
    @FindBy(xpath = "//*[h2]")
    public WebElement urunOlusturSayfasi;

    //    Name kutusu
    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameKutusu;

    //     Kodu kutusu
    @FindBy(xpath = "//*[@id='code']")
    public WebElement kodKutusu;

    //    Boy kutusu
    @FindBy(xpath = "//*[@id='length']")
    public WebElement boyKutusu;

    //    Fiyati kutusu
    @FindBy(xpath = "//*[@id='price']")
    public WebElement fiyatKutusu;

    //    En kutusu
    @FindBy(xpath = "//*[@id='width']")
    public WebElement enKutusu;

    //    Maliyeti kutusu
    @FindBy(xpath = "//*[@id='cost']")
    public WebElement maliyetKutusu;

    //    Yukseklik kutusu
    @FindBy(xpath = "//*[@id='height']")
    public WebElement yukseklikKutusu;

    //    Stok kutusu
    @FindBy(xpath = "//*[@id='stockLevel']")
    public WebElement stokKutusu;

    //    Agirlik kutusu
    @FindBy(xpath = "//*[@id='weight']")
    public WebElement agirlikKutusu;

//    Kategori kutusu

    @FindBy(xpath = "//*[@aria-expanded='false']")
    public WebElement kategoriKutusu;

//    Kategori kutusu 2

    @FindBy(xpath = "//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-1r7s2cg']")
    public WebElement kategoriKutusu2;

    //    Kategori yanindaki ok isareti
    @FindBy(xpath = "//*[@data-testid='ArrowDropDownIcon']")
    public WebElement kategoriOK;

//    Kategori eklendigini gosteren penceredeki OK butonu

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement OK;


    //    Kaydet Butonu
    @FindBy(xpath = "//*[text()='Kaydet']")
    public WebElement kaydetButonu;

    //    Eklenen urunun Urun Listesi sayfasina eklendigini dogrulamak icin Name sutunu ilk satir
    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    public WebElement urunListesiNameSutunu;

//    Kategori Ekle Butonu

    @FindBy(xpath = "//*[text()='Kategori Ekle']")
    public WebElement kategoriEkleButonu;

//    Kategori Ekle/Guncelle penceresi Kategori Adi alani

    @FindBy(xpath = "//*[@id='name']")
    public WebElement kategoriAdi;

//    Eklenen Kategori Adi Dogrulama

    @FindBy(xpath = "//*[text()='Altin Yaldizli Levhalar']")
    public WebElement kategoriAdiDogrulama;

//    Kategori Ekle Sayfasindaki Delete Butonlari

    @FindBy(xpath = "//button[@aria-label='delete']") // kacinci kategori ise indexi yazilacak
    public WebElement deleteButonu;

//      Kategori Silme Icin Evet Butonu

    @FindBy(xpath = "//*[text()='Evet']")
    public WebElement evetButonu;

//      Kategori Sayfasi

    @FindBy(xpath = "//*[@lang='en']")
    public WebElement kategoriSayfasi;

//      Kategori Degistir Butonu

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement kategoriDegistir;


//    Kategori yanindaki Kategori Ekle/Guncelle Butonu

    @FindBy(xpath = "(//*[@class='tabler-icon tabler-icon-rotate-clockwise-2 '])[6]")
    public WebElement kategoriEkleGuncelle;

    //    Kapat butonu
    @FindBy(xpath = "//*[text()='Kapat']")
    public WebElement kapatButonu;

    //    Kategori Degistir penceresindeki tik alani
    @FindBy(xpath = "(//*[@class='tabler-icon tabler-icon-point '])[1]")
    public WebElement tikButonu;

    //    Kategori degistirdikten sonraki Kapat butonu
    @FindBy(xpath = "(//button)[28]")
    public WebElement kapatButonu2;

//    **************************************

    //   Siparis Butonu
    @FindBy(xpath = "//*[text()='Sipariş']")
    public WebElement siparisButonu;

//    Acik Butonu

    @FindBy(xpath = "(//*[text()='Açık'])[1]")
    public WebElement acikButonu;

//    Urun Eslestir Simgesi

    @FindBy(xpath = "(//button[@aria-label='Ürün Eşleştir'])[1]")
    public WebElement eslestirSimgesi;


//    Urun Eslestir Penceresi Search Product Alani

    @FindBy(xpath = "//*[@aria-label='search product']")
    public WebElement searchProduct;

//    Urun Eslestir Penceresi Eslestir Butonu

    @FindBy(xpath = "(//*[text()='Eşleştir'])[1]")
    public WebElement eslestirButonu;

//    Eslestirdigimiz Urunun Ismini Dogrulama

    @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-n7kvvh'])[1]")
    public WebElement eslestirIsimDogrulama;
}


