@US_009 @smoke @all
Feature: US_009_Kullanıcı_profiline_erişebilmelive_burada_parola_ve_kullanıcı_bilgilerini_güncelleyebilmelidir

  @TC09_01
  Scenario: TC09_01 Kullanıcı parolasını değiştirebilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sağ üst kısımda bulunan profil simgesini tıkla
    * Açılan menüden profil sekmesine tıkla
    * Change Password alanının görünür olduğunu doğrula
    * Current Password kutucuğuna "kayitliPassword" gir
    * Current Password kutucuğunu görünür yap
    * New Password kutucuğuna "yeniPassword" gir
    * New Passwor kutucuğunu görünür yap
    * Confirm Password kutucuğuna "yeniPassword" gir
    * Confirm Password kutucuğunu görünür yap
    * Save butonuna tıkla
    * Tebrikler Başarıyla Güncellendi mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Sağ üst kısımda bulunan profil simgesini tıkla
    * Logout butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "yeniPassword" gir
    # *<<<<<<< Eski parolayı tekrar giriş parolası yap >>>>>>>>>
    * Giriş yap butonuna tıkla
    * Sağ üst kısımda bulunan profil simgesini tıkla
    * Açılan menüden profil sekmesine tıkla
    * Current Password kutucuğuna "yeniPassword" gir
    * Current Password kutucuğunu görünür yap
    * New Password kutucuğuna "kayitliPassword" gir
    * New Passwor kutucuğunu görünür yap
    * Confirm Password kutucuğuna "kayitliPassword" gir
    * Confirm Password kutucuğunu görünür yap
    * Save butonuna tıkla
    * Tebrikler Başarıyla Güncellendi mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Tarayıcıyı kapat

