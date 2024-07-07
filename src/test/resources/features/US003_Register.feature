@US_003 @all
Feature: US_003_Kullanıcı_yeni_bir_kullanıcı_olarak_sisteme_register_olabilmeli

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et

  @TC03_01
  Scenario: TC03_01 Kullanıcı, yeni kayıt işlemlerini sorunsuz yapabilmelidir

        #Bu test seneryosy ihtiyaç duyulduğunda koşulacaktır. Her zaman koşulmayacaktır.
        # Database tarafında sürekli yeni kullanıcı ekliyor.

    * FakeMail adresi almak için ilgili siteye git ve mail adresini kopyala
    * Wisersell sayfasına tekrar dön
    * Get Start butonuna tıkla
    * E-mail kutucuğuna fake email adresi gir
    * Password kutucuğuna "valid_password" gir
    * Name kutusuna "username" gir
    * Surname kutusuna "userSurname" gir
    * Privacy Policy checkBox kutucuğunu işaretle
    * Distance Policy checkBox kutucuğunu işaretle
    * Return Policy checkBox kutucuğunu işaretle
    * Next butonuna tıkla
    * Tekrar email kutucuğuna fake email adresi gir
    * Organizasyon name kutucuğuna "organizationName" gir
    * Phone kutucuğuna "phoneNumber" gir
    * Adress kutucuğuna "address" gir
    * City kutucuğuna "city" gir
    * State kutucuğuna "state" gir
    * Posta Code kutucuğuna "postCode" gir
    * Country kutucuğuna tıkla ve Türkiye seç
    * Finish butonuna tıkla
    * Tebrikler Kayıt işlemi Tamamlandı yazan onay kutusunun açıldığını gör
    * Ok butonuna tıkla
    * Giris yap butonuna tıkla
    * Tekrar fakeMail sayfasına geçiş yap
    * Mail boxta Wisersellden gelen maili aç
    * Verify Account butonuna tıkla
    * Wisersel login sayfasının açıldığını doğrula
    * Email kutucuğuna fake email adresi gir
    * Şifre kutucuğuna "valid_password" gir
    * Giriş yap butonuna tıkla
    * Wisersell Kullanıcı arayüzüne giriş yapıldığını doğrula
    * Tarayıcıyı kapat


  @TC03_02
  Scenario: TC03_02 Kullanıcı, yeni bir kullanıcı olarak Wisersell'e kayıt olabilmeli ancak e-mail doğrulaması  yapmadan sisteme giriş yapamamalı ve uyarı almalıdır

    * FakeMail adresi almak için ilgili siteye git ve mail adresini kopyala
    * Wisersell sayfasına tekrar dön
    * Get Start butonuna tıkla
    * E-mail kutucuğuna fake email adresi gir
    * Password kutucuğuna "valid_password" gir
    * Name kutusuna "username" gir
    * Surname kutusuna "userSurname" gir
    * Privacy Policy checkBox kutucuğunu işaretle
    * Distance Policy checkBox kutucuğunu işaretle
    * Return Policy checkBox kutucuğunu işaretle
    * Next butonuna tıkla
    * Tekrar email kutucuğuna fake email adresi gir
    * Organizasyon name kutucuğuna "organizationName" gir
    * Phone kutucuğuna "phoneNumber" gir
    * Adress kutucuğuna "address" gir
    * City kutucuğuna "city" gir
    * State kutucuğuna "state" gir
    * Posta Code kutucuğuna "postCode" gir
    * Country kutucuğuna tıkla ve Türkiye seç
    * Finish butonuna tıkla
    * Tebrikler Kayıt işlemi Tamamlandı yazan onay kutusunun açıldığını gör
    * Ok butonuna tıkla
    * Giris yap butonuna tıkla
    * Email kutucuğuna fake email adresi gir
    * Şifre kutucuğuna "valid_password" gir
    * Giriş yap butonuna tıkla
    * "Lütfen hesabınızı doğrulayınız. Doğrulama maili gelmediyse tekrar isteyebilirsiniz." uyarısının verildiğini doğrula
    * Tarayıcıyı kapat

  @TC03_03
  Scenario: TC03_03 Kullanıcı, daha önce kayıtlı bir e-posta adresi ile tekrar kayıt olamamalı ve bu işlemi  yapmak istediğinde uyarı almalıdır

    * FakeMail adresi almak için ilgili siteye git ve mail adresini kopyala
    * Wisersell sayfasına tekrar dön
    * Get Start butonuna tıkla
    * E-mail kutucuğuna fake email adresi gir
    * Password kutucuğuna "valid_password" gir
    * Name kutusuna "username" gir
    * Surname kutusuna "userSurname" gir
    * Privacy Policy checkBox kutucuğunu işaretle
    * Distance Policy checkBox kutucuğunu işaretle
    * Return Policy checkBox kutucuğunu işaretle
    * Next butonuna tıkla
    * Tekrar email kutucuğuna fake email adresi gir
    * Organizasyon name kutucuğuna "organizationName" gir
    * Phone kutucuğuna "phoneNumber" gir
    * Adress kutucuğuna "address" gir
    * City kutucuğuna "city" gir
    * State kutucuğuna "state" gir
    * Posta Code kutucuğuna "postCode" gir
    * Country kutucuğuna tıkla ve Türkiye seç
    * Finish butonuna tıkla
    * Tebrikler Kayıt işlemi Tamamlandı yazan onay kutusunun açıldığını gör
    * Ok butonuna tıkla
    * Giris yap butonuna tıkla
    * Bir hesap oluştur sekmesine tıkla
    * E-mail kutucuğuna fake email adresi gir
    * Password kutucuğuna "valid_password" gir
    * Name kutusuna "username" gir
    * Surname kutusuna "userSurname" gir
    * Privacy Policy checkBox kutucuğunu işaretle
    * Distance Policy checkBox kutucuğunu işaretle
    * Return Policy checkBox kutucuğunu işaretle
    * Next butonuna tıkla
    * Tekrar email kutucuğuna fake email adresi gir
    * Organizasyon name kutucuğuna "organizationName" gir
    * Phone kutucuğuna "phoneNumber" gir
    * Adress kutucuğuna "address" gir
    * City kutucuğuna "city" gir
    * State kutucuğuna "state" gir
    * Posta Code kutucuğuna "postCode" gir
    * Country kutucuğuna tıkla ve Türkiye seç
    * Finish butonuna tıkla
    * "Bu eposta adresi kullanılıyor."  uyarısının göründüğünü doğrula
    * Tarayıcıyı kapat

  @TC03_04
  Scenario: TC03_04 Kullanıcı, yeni bir kullanıcı olmak için şartları sağlamayan e-posta ve porola ile  ilerleyememeli ve uyarı almalıdır.

    * Get Start butonuna tıkla
    * E-mail kutucuğuna "invalid_mail" adresi gir
    * Password kutucuğuna "invalid_password" gir
    * Name kutusuna "username" gir
    * Surname kutusuna "userSurname" gir
    * Privacy Policy checkBox kutucuğunu işaretle
    * Distance Policy checkBox kutucuğunu işaretle
    * Return Policy checkBox kutucuğunu işaretle
    * Next butonuna tıkla
    * E-mail kutucu altında beliren uyarı mesajının göründüğünü doğrula
    * Password kutucuğu altında beliren uyarı mesajının göründüğünü doğrula
    * Tarayıcıyı kapat

  @TC03_05
  Scenario: TC03_05 Kullanıcı, TestAutomation ile oluşturduğu register kullanıcı bilgilerini sistemden silebilmeli
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "superAdminMail" adresini gir
    * Şifre kutucuğuna "superAdminPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Ayarlar sekmesini tıkla
    * Kullanıcı sekmesine tıkla
    * Filtreleri göster gizle simgesine tıkla
    * Açılan name filtre alanaına "username" gir
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Açılan menüden Delete butonuna tıkla
    * Sil butonuna tıkla
    * Silme işleminin başarılı olduğuna dair Tebrikler mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Eğer varsa başka testautomation kullanıcıları onları da sil
    * Tarayıcıyı kapat