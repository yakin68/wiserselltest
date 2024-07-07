package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //HomePage Get Start butonu
    @FindBy(xpath = "//a[text()='Get Start']")
    public WebElement homePage_body_getStartButton;


    //Register Kullanıcı Bilgileri email kutusu
    @FindBy(id = "email")
    public WebElement register1_emailTextBox;


    //Register Kullanıcı Bilgileri password kutusu
    @FindBy(id = "password")
    public WebElement register1_passwordTextBox;


    //Register Kullanıcı Bilgileri name kutusu
    @FindBy(id = "name")
    public WebElement register1_nameTextBox;

    //Register Kullanıcı Bilgileri Surname kutusu
    @FindBy(id = "surname")
    public WebElement register1_surNameTextBox;

      //Register Kullanıcı Bilgileri Privacy Policy onay kutusu
    @FindBy(id = "privacyPolicy")
    public WebElement register1_privacyPolicyCheckBox;

      //Register Kullanıcı Bilgileri Distance Policy onay kutusu
    @FindBy(id = "distancePolicy")
    public WebElement register1_distancePolicyCheckBox;

      //Register Kullanıcı Bilgileri Return Policy onay kutusu
    @FindBy(id = "returnPolicy")
    public WebElement register1_returnPolicyCheckBox;









    //Register Kullanıcı Bilgileri Next Butonu
    @FindBy(xpath = "//button[text()='Next']")
    public WebElement register1_nextButton;

    //Register Kullanıcı Bilgileri hatalı mail uyarısı
    @FindBy(xpath = "//*[text()='email must be a valid email']")
    public WebElement register1_invalidMailMessage;

    //Register Kullanıcı Bilgileri hatalı şifre uyarısı
    @FindBy(xpath = "//*[text()='Şifre en az 8 karakter, bir büyük harf, bir küçük harf ve bir özel karakter içermelidir']")
    public WebElement register1_invalidPasswordMessage;

    //Register Organizasyon Bilgileri email kutusu
    @FindBy(id = "email")
    public WebElement register2_emailTextBox;


    //Register Organizasyon Bilgileri "Organization Name" kutusu
    @FindBy(id = "name")
    public WebElement register2_organizationNameTextBox;

    //Register Organizasyon Bilgileri "Phone" kutusu
    @FindBy(id = "phone")
    public WebElement register2_phoneTextBox;

    //Register Organizasyon Bilgileri "Adress" kutusu
    @FindBy(id = "address")
    public WebElement register2_addressTextBox;


   //Register Organizasyon Bilgileri "City" kutusu
    @FindBy(id = "city")
    public WebElement register2_cityTextBox;

       //Register Organizasyon Bilgileri "State" kutusu
    @FindBy(id = "state")
    public WebElement register2_stateTextBox;

  //Register Organizasyon Bilgileri "Postal Code" kutusu
    @FindBy(id = "postalCode")
    public WebElement register2_postalCodeTextBox;

//Register Organizasyon Bilgileri "country" kutusu
    @FindBy(id = "countryId")
    public WebElement register2_countryTextBox;


    //Register Kullanıcı Bilgileri Finish Butonu
    @FindBy(xpath = "//button[text()='Finish']")
    public WebElement register2_finishButton;

  //Register "Kayıt işlemi Tamamlandı" mesaj kutusu
    @FindBy(xpath = "//div[text()='Kayıt işlemi Tamamlandı']")
    public WebElement register_kayitIslemiTamamlandiMessage;

    //Register "Kayıt işlemi Tamamlandı" OK butonu
    @FindBy(xpath = "//*[text()='OK']")
    public WebElement register_okButton;

    //Register "Giriş Yap" butonu
    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement register_girisYap;

   //fake mail sitesisayfası mail kutusu
    @FindBy(xpath = "//*[@id='navbar']/div/div[3]/form/div/input")
    public WebElement fakemail_mailBox;

   //fake mail sitesi mail kutusu sağ yön ok buttonu
    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[3]/form/button")
    public WebElement fakemail_onay;

    //fake mail sitesi  mail kutusu "Verify Account"
    @FindBy(xpath = "//a[text()='Verify Account']")
    public WebElement fakemail_verifyAccount;


    //Bu mail kullanılıyor uyarı mesajı
    @FindBy(xpath = "//*[text()='Bu eposta adresi kullanılıyor.']")
    public WebElement loginPage_buMailKullaniliyor;

}
