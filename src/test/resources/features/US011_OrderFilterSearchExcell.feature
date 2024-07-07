@US_011 @all
Feature: US_011_Kullanıcı_gelen_sipariş_listesini_görebilmeli_ve_burada_arama_filtreleme_sıralama_yapabilmeli_ve_sipariş_listesini_alabilmelidir

  @TC11_01
  Scenario: TC11_01 Kullanıcı, gelen sipariş listesini görebilmeli ve burada arama, filtreleme, sıralama yapabilmeli ve sipariş listesini alabilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Search simgesine tıkla
    * Açılan search textBox'a ilk ürünün Label No'sunu yaz
    * Ekrana gelen sipariş ile aranan siparişin eşleştiğini doğrula
    * Search textbox'ı temizle
    * Tümünü seç kutucuğunu tıkla
    * '20 Satır Arasından 20 Adet Seçildi' benzeri yazının göründüğünü doğrula
    * Seçimi Temizle sekmesine tıkla
    * Platform sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Label No sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Sipariş No sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Alıcı sütun bailığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    #* Sipariş ayrıntıları sütun başlığına tıkla
    #* Liste sıralamasının değiştiğini doğrula
    * Servis Seviyesi sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Sipariş Tarihi sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Ülke sütun başlığına tıkla
    * Liste sıralamasının değiştiğini doğrula
    * Listenin başındaki ürün seçme kutucuğunu tıkla
    * Ürün Listesi sekmesine tıkla
    * Ürün listesinin excell olarak indirildiğini doğrula
    * Tarayıcıyı kapat
