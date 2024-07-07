@smoke @all @US_004
Feature: US_004_Mevcut_bir_kullanıcı_olarak_kullanıcı_Wisersell_hesabına_giriş_yapabilmeli

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et

  @TC04_01
  Scenario: TC04_01 Kullanıcı, kendisine tanımlı hesap bilgileri ile kullanıcı arayüzüne sorunsuz giriş yapabilmeli

    * Login butonuna tıkla
    * Login sayfasının açıldığını doğrula
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Wisersell Kullanıcı arayüzüne giriş yapıldığını doğrula
    * Tarayıcıyı kapat


  @TC04_02
  Scenario Outline:TC04_02 Mevcut bir kullanıcı olarak,yanlış parola ile giriş yapamalıdır

    * Login butonuna tıkla
    * Login sayfasının açıldığını doğrula
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutusuna "<invalidPassword>" gir
    * Giriş yap butonuna tıkla
    * Şifrenin yanlış girildiği uyarısını gör
    * Tarayıcıyı kapat

    Examples:
      | invalidPassword |
      | bb123456*       |
      | BB123456*       |
