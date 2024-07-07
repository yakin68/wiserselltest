@US_008 @smoke @all
  Feature: US_008_Kullanıcı_dil_tercihlerini_değiştirebileceği_buton_olmalıdır

    @TC08_01
    Scenario: TC08_01 Kullanıcı istediği dil tercihini seçebilir ve sayfa dili anında istediği dil tercihine göre yeniden yüklenir.

      * Web tarayıcısını aç
      * Wisersell'in "URL" adresine git
      * Eğer cookies varsa kabul et
      * Login butonuna tıkla
      * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
      * Şifre kutucuğuna "kayitliPassword" gir
      * Giriş yap butonuna tıkla
      * Sayfa dil seçeneğini  İngilizce olarak seç
      * Sayfa dilinin İngilizce olduğunu doğrula
      * Sayfa dil seçeneğini  Türkçe olarak seç
      * Sayfa dilinin Türkçe olduğunu doğrula
      * Tarayıcıyı kapat