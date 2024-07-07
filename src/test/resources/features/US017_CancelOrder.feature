@US_017 @smoke @all
Feature: US_017_Kullanıcı_isterse_siparişi_iptal_edebilmelidir

  @TC17_01
  Scenario: TC17_01 Kullanıcı siparişi iptal edebilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Ürün listesinde ilk ürünün Label No'sunu kaydet
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Siparişi iptal et sekmesine tıkla
    * Siparişi iptal et onay kutusunun göründüğünü doğrula
    * İptal Et butonuna tıkla
    * Tebrikler Siparişiniz Başarıyla İptal Edildi mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Açık sipariş listesinde siparişin görünmediğini doğrula
    * Tarayıcıyı kapat

