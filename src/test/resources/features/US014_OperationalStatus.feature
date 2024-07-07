@US_014 @smoke @all
Feature: US_014_Kullanıcı_siparişlerini_yönetmek_için_üretim_aşamaları_tanımlayabilmeli_ve_siparişlerini_istediği_üretim_aşamasına_yönlendirebilmelidir

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla


  @TC14_01
  Scenario: TC14_01 Kullanıcı siparişlerini yönetmek için üretim aşamaları tanımlayabilmeli ve silebilmelidir

    * Sol menü barından Ayarlar sekmesini tıkla
    * Ayarlar altında Operasyonel Statüler sekmesine tıkla
    * Açılan sayfada Statü Ekle butonuna tıkla
    * Açılan Kutucuğa statü adı olarak TestAutomation yaz
    * Kaydet butonuna tıkla
    * Ok butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüde TestAutomation statüsünün görünür olduğunu doğrula
    * Sol menü barından Sipariş sekmesini tıkla
    * Ayarlar altında Operasyonel Statüler sekmesine tıkla
    * Ekranda görünen statülerden TestAutomation statüsünü yanında bulunan delete butonuna tıkla
    * Tebrikler Statü silindi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Tarayıcıyı kapat


  @TC14_02
  Scenario: TC14_02 Kullanıcı, siparişlerini istediği üretim aşamasına yönlendirebilmelidir


    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Ürün listesinde ilk ürünün Label No'sunu kaydet
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Durum değiştir sekmesine tıkla
    * Durum Değiştir kutucuğunun açıldığını doğrula
    * Tanımlı ilk statüyü tıkla
    * Kaydet butonuna tıkla
    * Tebrikler Statüler Başarıyla Güncellendi mesajının görür olduğunu doğrula
    * Ok butonuna tıkla
    #* Statü değiştirme kutucuğunu kapatmak için Kapat butonuna tıkla
    * Sipariş menüsü altında ilgili statüye tıkla
    * Açılan sipariş listesinde taşınan siparişin göründüğünü Label No ile doğrula
    * Tarayıcıyı kapat