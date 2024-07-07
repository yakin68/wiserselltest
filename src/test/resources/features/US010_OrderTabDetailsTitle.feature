@US_010 @smoke @all
Feature: US_010_Kullanıcı_siparişleri_yönetebileceği_bir_alan_olmalıdır

  @TC10_01
  Scenario: TC10_01 Kullanıcı, siparişleri yönetmek için her bir siparişi ayrıntılı başlıklar altında detaylı olarak listelenmeli

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Sipariş sayfa bilgileri alanının açıldığını doğrula
    * İşlemler üst başlığının görünür olduğunu doğrula
    * Tümünü Seç kutucuğunun görünür ve aktif olduğunu doğrula
    * Platform başlığının görünür olduğunu doğrula
    * Label No başlığının görünür olduğunu doğrula
    * Sipariş No başlığının görünür olduğunu doğrula
    * Alıcı başlığının görünür olduğunu doğrula
    * Sipariş ayrıntıları başlığının görünür olduğunu doğrula
    * Servis Seviyesi başlığının görünür olduğunu doğrula
    * Sipariş Tarihi başlığının görünür olduğunu doğrula
    * Ülke başlığının görünür olduğunu doğrula
    * Tarayıcıyı kapat