@US_002 @smoke @all
Feature: US_002_Kullanıcı_dil_tercihihlerini_değiştirebilmelidir

  @TC02_01
  Scenario: TC02_01 Kullanıcı dil seçeneklerini görebilmeli ve uygulayabilmelidir

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Sayfa dil seçeneğini  İngilizce olarak seç
    * Sayfa dilinin İngilizce olduğunu doğrula
    * Sayfa dil seçeneğini  Türkçe olarak seç
    * Sayfa dilinin Türkçe olduğunu doğrula
    * Tarayıcıyı kapat