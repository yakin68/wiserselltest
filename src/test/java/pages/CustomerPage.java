package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerPage {



    public CustomerPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Sol menü barı altında müşteri sekmesi
    @FindBy(xpath = "//span[text()='Müşteri']")
    public WebElement customerSection;

    //Müşteri listesi isim
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement customerPage_list_name;

  //Müşteri listesi email
    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement customerPage_list_email;

  //Müşteri listesi adres
    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement customerPage_list_address;

  //Müşteri listesi telefon
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    public WebElement customerPage_list_phone;

  //Müşteri listesi ülke
    @FindBy(xpath = "//tbody/tr[1]/td[8]")
    public WebElement customerPage_list_country;

  //Müşteri sayfası Top 10 Country grafiği
    @FindBy(xpath = "//*[text()='Top 10 Country']")
    public WebElement customerPage_top10country;

  //Müşteri sayfası Customer Created Line grafiği
    @FindBy(xpath = "//*[text()='Customer Created Line']")
    public WebElement customerPage_customerCreatedLine;

  //Müşteri sayfası name filtresi arama alanı
    @FindBy(xpath = "//input[@placeholder='Name LastName Filtresi']")
    public WebElement customerPage_nameFilter;



}
