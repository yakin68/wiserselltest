@US_012 @smoke @all
Feature: US_012_Kullanıcının_güncel_siparişleri_görebilmek_için_sipariş_yenile_yapabileceği_bir_alan_olmalıdır

  @TC12_01
  Scenario: TC12_01 Kullanıcı sipariş listesini güncellemek için sipariş yenile yapabilmeli

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Sipariş Yenile sekmesine tıkla
    * Sipariş yenileme kutucuğunun açıldığını doğrula
    * Siparişler yenileme işlemi bitene kadar bekle
    * Sipariş yenileme işlemi başarıyla tamamlandı mesajını gör
    * Tamam butonuna tıkla
    * Tarayıcıyı kapat