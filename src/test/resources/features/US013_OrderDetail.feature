@US_013 @smoke @all
Feature: US_013 Kullanıcı_istediği_sparişin_detayını_görebilmeli_sipariş_bilgilerini_değiştirebilmelidir

  @TC13_01
  Scenario: TC13_01 Kullanıcı, sipariş detaylarına erişebilmeli, sipariş bilgilerinde güncelleme yapabilmelidir

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
    * Açılan menüden Detay Gör'e tıkla
    * Açılan ürün detaylarının Label No'sunun doğru Label No olduğunu doğrula
    * Alıcı bilgileri düzenleme simgesine tıkla
    * Alıcı satırında isim soyisim sonuns xyz ilave et.
    * Alıcı bilgileri değişikliklerini kaydetmek için onay simgesine tıkla
    * Tebrikler Kaydedildi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Alıcı Bilgilerinde yapılan değişikliğin görünür olduğunu doğrula
    * Fatura Bilgileri alanına geçiş için Fatura Bilgileri üst başlığı tıkla
    * Fatura bilgileri düzenleme simgesini tıkla
    * Adres ilk satıra xyz ilave et
    * Fatura bilgileri değişikliklerini kaydetmek için onay simgesine tıkla
    * Tebrikler Kaydedildi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Fatura Bilgilerinde yapılan değişikliğin görünür olduğunu doğrula
    * Notlar düzenleme simgesini tıkla
    * Kullanıcı notu satırına xyz ilave et
    * Notlar değişikliklerini kaydetmek için onay simgesine tıkla
    * Tebrikler Kaydedildi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Notlar alanında yapılan değişikliğin görünür olduğunu doğrula
    * Kişiselleştirme düzenleme simgesini tıkla
    * Açılan alana xyz ilave et
    * Kişiselleştirme değişikliklerini kaydetmek için onay simgesine tıkla
    * Tebrikler Kaydedildi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Kişiselleştirme alanında yapılan değişikliğin görünür olduğunu doğrula
    * Sipariş detayını kapatmak için X Kapat butonunu tıkla
    * Sayfayı yenile
    * Yapılan değişikliklerin sipariş listesindede görünür olduğunu doğrula
    * Tarayıcıyı kapat



