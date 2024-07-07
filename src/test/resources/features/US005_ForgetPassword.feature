@US_005 @smoke @all
Feature: US_005_Kullanıcı_şifresini_hatırlayamadığında_Şifremi_Unuttum_bağlantısına_erişebilmelidir

  @TC05_01
  Scenario: TC05_01 Kullanıcı, şifremi unuttum özelliğini kullanarak güvenli bir şekilde yeni şifre oluşturabilmeli

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * ForgetPassword sekmesine tıkla
    * Email Adress kutucuğuna kayıtlı "forgetMail" adresini gir
    * Forgot Password butonuna tıkla
    * Tebrikler "mail"adresine şifre yenileme linki gönderildi mesajının göründünüğünü doğrula
    * Ok butonuna tıkla
    * Tarayıcıyı kapat


        # Bu testin devamı şimdilik manuel olarak koşulmaktadır.
        # Gmail otomasyon ile girişi engellediği için maile erişim sağlanamamktadır.