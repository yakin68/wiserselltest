@US_020 @smoke @all
Feature: US_020_Kullanıcı_sipariş_sayısını_görebilmeli_sipariş_listesini_tam_ekran_yapabilmeli_sipariş_listesi_satır_sıklığını_ayarlayabilmeli_ve_istediği_sütunları_kaldırabilmeli

  @TC20_01
  Scenario: TC20_01 Kullanıcı sipariş sayısını görebilmeli, sipariş listesini tam ekran yapabilmeli, sipariş listesi satır sıklığını ayarlayabilmeli ve istediği sütunları kaldırabilmeli

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Sipariş listesi üzerinde sipariş miktarının göründüğünü doğrula
    * Açılan menüden Açık sekmesini tıkla
    * Tam Ekran Değiştir simgesine tıkla
    * Sipariş listesinin tam ekran görünümünde olduğunu doğrula
    * Tam Ekran Değiştir simgesine tıkla
    * Satır sıklığını tıkla ve sırası ile tüm sıklık aşamalarının göründüğünü doğrula
    * Sutünları Göster Gizle sekmesine tıkla
    * Platform buttonuna tıkla
    * Sutünları Göster Gizle kutucuğunu kapat
    * Palatform sutünunun kapandığını doğrula
    * Tarayıcıyı kapat
