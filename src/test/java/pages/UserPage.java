package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserPage {
    public UserPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //UserPage Wisersell logosu altı   Hoşgeldiniz mesajı
    @FindBy(xpath = "//*[text()='Hoşgeldiniz']")
    public WebElement userPage_Hosgeldiniz;

    //UserPage sol bar user profil ad bilgisi
    @FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-h6 css-mq7gx5']")
    public WebElement userPage_leftDownUserProfilNameInfo;

    //UserPage sağ üst profil simgesi.
    @FindBy(xpath = "//button[@aria-controls='msgs-menu']")
    public WebElement userPage_rightUpUserProfilIcon;

    //UserPage sağ üst profil menü email bilgisi
    @FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-subtitle2 css-1e2marm']")
    public WebElement userPage_profileIconEmailInfo;

    //UserPage slider
    @FindBy(xpath = "//div[@class='slick-slider slick-initialized']")
    public WebElement userPage_slider;

    //UserPage slider kaydırma sol butonu
    @FindBy(xpath = "//button[@class='slick-arrow slick-prev']")
    public WebElement userPage_sliderLeftButton;

    //UserPage slider kaydırma sağ butonu
    @FindBy(xpath = "//button[@class='slick-arrow slick-next']")
    public WebElement userPage_sliderRighButton;

   //UserPage duyurular kısmı
    @FindBy(xpath = "//*[text()='Duyurular']")
    public WebElement userPage_duyurular;


}
