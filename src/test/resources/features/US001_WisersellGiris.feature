@US_001 @smoke @all
Feature: US_001_Wisersell_websitesi_erişilebilir_olmalıdır

  Background:
    Given Web tarayıcısını aç
    And Wisersell'in "URL" adresine git
    Given Eğer cookies varsa kabul et

  @TC01_01
  Scenario: TC01_01 Kullanıcı  Wisersell sayfasına erişebilmelidir

    Given Ana sayfada Wisersell'in resmi logosunun görünür olduğunu doğrula
    And Ana sayfada Login butonunun görünür olduğunu doğrula
    Then Açılan sayfa url adresinin "url_home" olduğunu doğrula
    Then 1 saniye bekle
    And Tarayıcıyı kapat
