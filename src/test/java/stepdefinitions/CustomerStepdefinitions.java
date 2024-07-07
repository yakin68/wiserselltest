package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.CustomerPage;
import pages.OrderPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerStepdefinitions {
    OrderPage orderPage = new OrderPage();
    CustomerPage customerPage = new CustomerPage();

    String musteriName;
    String musteriEmail;
    String musteriAdres;
    String musteriTelefon;


    @Given("Müşteri bilgileri sekmesini tıkla")
    public void müşteri_bilgileri_sekmesini_tıkla() {

        orderPage.orderDetail_musteriBilgileriSekmesi.click();
        ReusableMethods.bekle(1);
    }

    @Given("Müşteri adını kaydet")
    public void müşteri_adını_kaydet() {
        musteriName = orderPage.orderDetail_musteriBilgileri_name.getText();

    }

    @Given("Müşteri adresini ülke ve adres olarak ayrı ayrı kaydet")
    public void müşteri_adresini_ülke_ve_adres_olarak_ayrı_ayrı_kaydet() {
        musteriAdres = orderPage.orderDetail_musteriBilgileri_fullAdress.getText();
    }

    @Given("Email bilgisini kaydet")
    public void email_bilgisini_kaydet() {
        musteriEmail = orderPage.orderDetail_musteriBilgileri_email.getText();
    }

    @Given("Telefon numarasını kaydet")
    public void telefon_numarasını_kaydet() {
        musteriTelefon = orderPage.orderDetail_musteriBilgileri_phone.getText();
    }

    @Given("Sol menü barından Müşteri sekmesini tıkla")
    public void sol_menü_barından_müşteri_sekmesini_tıkla() {
        customerPage.customerSection.click();
        ReusableMethods.bekle(2);
    }

    @Given("Name filtre kutusuna kaydedilen müşteri ismi yaz ve filtrele")
    public void name_filtre_kutusuna_kaydedilen_müşteri_ismi_yaz_ve_filtrele() {
customerPage.customerPage_nameFilter.sendKeys(musteriName);
ReusableMethods.bekle(1);
    }

    @Given("Müşteri adının doğru listelendiğini doğrula")
    public void müşteri_adının_doğru_listelendiğini_doğrula() {
        String expected=musteriName;
        String actual=customerPage.customerPage_list_name.getText();
        assertEquals(expected,actual);


    }

    @Given("Müşteri Email bilgisinin doğru listelendiğini doğrula")
    public void müşteri_email_bilgisinin_doğru_listelendiğini_doğrula() {
        String expected=musteriEmail;
        String actual=customerPage.customerPage_list_email.getText();
        assertEquals(expected,actual);
    }

    @Given("Müşteri adres bilgisinin doğru listelendiğini doğrula")
    public void müşteri_adres_bilgisinin_doğru_listelendiğini_doğrula() {
        String expected=musteriAdres;
        String actual=customerPage.customerPage_list_address.getText();
        assertTrue(expected.contains(actual));
    }

    @Given("Müşteri telefon bilgisinin doğru listelendiğini doğrula")
    public void müşteri_telefon_bilgisinin_doğru_listelendiğini_doğrula() {
        String expected=musteriTelefon;
        String actual=customerPage.customerPage_list_phone.getText();
        assertEquals(expected,actual);
    }

    @Given("Müşteri ülke bilgisinin doğru listelendiğini doğrula")
    public void müşteri_ülke_bilgisinin_doğru_listelendiğini_doğrula() {
        String expected=musteriAdres;
        String actual=customerPage.customerPage_list_address.getText();
        assertTrue(expected.contains(actual));
    }

    @Given("Top {int} Country grafiğinin görünür olduğunu doğrula")
    public void top_country_grafiğinin_görünür_olduğunu_doğrula(Integer int1) {

        assertTrue(customerPage.customerPage_top10country.isDisplayed());
    }
    @Given("Customer Created Line grafiğinin görünür olduğunu doğrula")
    public void customer_created_line_grafiğinin_görünür_olduğunu_doğrula() {
       assertTrue(customerPage.customerPage_customerCreatedLine.isDisplayed());
    }

}
