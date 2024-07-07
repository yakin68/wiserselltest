package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserProfilePage {

    public UserProfilePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Profil simgesi altında Profil sekmesi
    @FindBy(xpath = "//div[@class='hover-text-primary MuiBox-root css-1yyviwt']")
    public WebElement userProfilePage_ProfileSection;

    //Profil simgesi altında Profil sekmesi
    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement userProfilePage_ChangePasswordText;

    //Profile Current Password metin kutusu
    @FindBy(xpath = "//input[@name='password']")
    public WebElement userProfilePage_CurrentPasswordTextBox;

    //Profile New Password metin kutusu
    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement userProfilePage_newPasswordTextBox;

    //Profile Confirm Password metin kutusu
    @FindBy(xpath = "//input[@name='newPassword2']")
    public WebElement userProfilePage_confirmPasswordTextBox;

    //Profile "Tebrikler Başarıyla Güncellendi" mesajı
    @FindBy(xpath = "//h2[text()='Tebrikler']")
    public WebElement userProfilePage_TebriklerMessage;

    //Profile "Save" butonu
    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement userProfilePage_ChangePasswordSaveButton;

    //Profile sol alt logout
    @FindBy(xpath = "//div[@class='MuiBox-root css-zdpt2t']")
    public WebElement userProfilePage_LeftDownLogoutButton;

    //Profile Current Password Görünür yap göz simgesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-q9cuy5'])[1]")
    public WebElement userProfilePage_CurrentPasswordEyeIcon;

    //Profile New Password Görünür yap göz simgesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-q9cuy5'])[2]")
    public WebElement userProfilePage_NewPasswordEyeIcon;

    //Profile Confirm Password Görünür yap göz simgesi
    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-q9cuy5'])[3]")
    public WebElement userProfilePage_ConfirmPasswordEyeIcon;


}
