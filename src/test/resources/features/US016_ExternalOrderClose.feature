@US_016 @smoke @all
Feature: US_016_Kullanıcı_siparişe_harici_kapatma_yapabilmelidir

  @TC16_01
  Scenario: TC16_01 Kullanıcı harici olarak sipariş kapama yapabilmeli

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
    * Harici Gönderi Kapama sekmesine tıkla
    * Harici Sipariş Kapama alanının açıldığını doğrula
    * Boy kutucuğuna 10 yaz
    * En kutucuğuna 20 yaz
    * Yükseklik kutucuğuna 30 yaz
    * Ağırlık kutucuğuna 1 yaz
    * Miktar kutucuğuna 1 yaz
    * kargo firması kutucuğun tıklayarak drop down menüyü aç
    * Herhangi bir kargo sirketini sec
    * Kaydet butonuna tıkla
    * Tebrikler Siparişiniz Başarıyla Kapatıldı mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Sayfayı yenile
    * Açık sipariş listesinde siparişin görünmediğini doğrula
    * Sipariş menüsü altında Kapalı sekmesine tıkla
    * Kapalı sipariş listesinde kapatılan siparişin görünür olduğunu doğrula
    * Tarayıcıyı kapat


