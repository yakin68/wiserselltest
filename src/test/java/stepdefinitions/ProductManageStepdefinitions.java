package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductPage;
import utilities.ReusableMethods;

public class ProductManageStepdefinitions {

    ProductPage productPage=new ProductPage();

    @Given("Kullanici browser kismindan Urun sekmesine tiklar")
    public void kullanici_browser_kismindan_urun_sekmesine_tiklar() {
        ReusableMethods.waitFor(2);
        productPage.urunButonu.click();
    }

    @Then("Kullanici Urun sekmesi altindaki Urun Kategorileri butonuna tiklar")
    public void kullanici_urun_sekmesi_altindaki_urun_kategorileri_butonuna_tiklar() {
        productPage.urunKategorileriButonu.click();
    }
    @Then("Kullanici Urun Kategorileri sayfasindaki Kategori Ekle butonuna tiklar")
    public void kullanici_urun_kategorileri_sayfasindaki_kategori_ekle_butonuna_tiklar() {
        productPage.kategoriEkleButonu.click();
    }
    @Then("Kullanici Kategori Ekle Guncelle penceresine kategori adini girer")
    public void kullaniciKategoriEkleGuncellePenceresineKategoriAdiniGirer() {
        productPage.kategoriAdi.sendKeys("Altin Yaldizli Levhalar");
    }

    @Then("Kullanici kategorinin eklendigini dogrular")
    public void kullanici_kategorinin_eklendigini_dogrular() {
        Assert.assertTrue(productPage.kategoriAdiDogrulama.isDisplayed());
    }

    //    ****************** TC28_02 *********************
    @Then("Kullanici Urun Kategorileri sayfasindaki olusturmus oldugu kategorinin yanindaki cop kutusu isaretine tiklar")
    public void kullanici_urun_kategorileri_sayfasindaki_olusturmus_oldugu_kategorinin_yanindaki_cop_kutusu_isaretine_tiklar() {
        ReusableMethods.waitFor(1);
        productPage.deleteButonu.click();
    }
    @Then("Kullanici acilan Kategori Sil penceresinden Evet butonuna tiklar")
    public void kullanici_acilan_kategori_sil_penceresinden_evet_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        productPage.evetButonu.click();
    }
    @Then("Kullanici Kategoriniz Basariyla Silindi penceresindeki OK butonuna tiklar")
    public void kullanici_kategoriniz_basariyla_silindi_penceresindeki_ok_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        productPage.OK.click();
    }

    @Then("Kullanici sayfadan kategoriyi sildigini dogrular")
    public void kullanici_sayfadan_kategoriyi_sildigini_dogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertFalse("Sonuç beklenen metni içermiyor!", productPage.kategoriSayfasi.getText().contains("Altin Yaldizli Levhalar"));
    }

    //   ****************** TC28_03 *********************
    @Then("Kullanici ilk kategori yanindaki Kategori Degistir simgesine tiklar")
    public void kullanici_ilk_kategori_yanindaki_kategori_degistir_simgesine_tiklar() {
        productPage.kategoriEkleGuncelle.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici Kapat butonuna tiklar")
    public void kullanici_kapat_butonuna_tiklar() {
        productPage.kapatButonu.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici Kategori sayfasinin sag tarafindaki Kategori Degistir butonuna tiklar")
    public void kullanici_kategori_sayfasinin_sag_tarafindaki_kategori_degistir_butonuna_tiklar() {
        productPage.kategoriDegistir.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici acilan pencereden degistirmek istedigi kategoriyi secer")
    public void kullanici_acilan_pencereden_degistirmek_istedigi_kategoriyi_secer() {
        productPage.tikButonu.click();
        ReusableMethods.waitFor(1);
    }
    @Then("Kullanici OK butonuna tiklar")
    public void kullanici_ok_butonuna_tiklar() {
        ReusableMethods.clickWithJS(productPage.OK);
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici tekrar Kapat butonuna tiklar")
    public void kullanici_tekrar_kapat_butonuna_tiklar() {
        productPage.kapatButonu.click();
        ReusableMethods.waitFor(1);
    }
}
