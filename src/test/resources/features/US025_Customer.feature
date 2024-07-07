
@US_025 @all @smoke
Feature: US_025_Kullanıcı_sipariş_veren_müşterilerin_kaydını_tuttuğu_bir_alan_olmalı_ve_bu_alanda_müşteri_istatisklerini_görebilmelidir

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla

  @TC25_01
  Scenario: TC25_01 Müşteri bilgileri kaydının doğru alındığını doğrula

    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Açılan menüden Detay Gör'e tıkla
    * Müşteri bilgileri sekmesini tıkla
    * Müşteri adını kaydet
    * Müşteri adresini ülke ve adres olarak ayrı ayrı kaydet
    * Email bilgisini kaydet
    * Telefon numarasını kaydet
    * Sipariş detayını kapatmak için X Kapat butonunu tıkla
    * Sol menü barından Müşteri sekmesini tıkla
    * Filtreleri göster gizle simgesine tıkla
    * Name filtre kutusuna kaydedilen müşteri ismi yaz ve filtrele
    * Müşteri adının doğru listelendiğini doğrula
    * Müşteri Email bilgisinin doğru listelendiğini doğrula
    * Müşteri adres bilgisinin doğru listelendiğini doğrula
    * Müşteri telefon bilgisinin doğru listelendiğini doğrula
    * Müşteri ülke bilgisinin doğru listelendiğini doğrula
    * Tarayıcıyı kapat


   
  @TC25_02
  Scenario: TC25_01 Müşteri sayfasında ülke/sipariş ve müşteri/sipariş istatisklerini gösteren grafiklerin göründüğünü doğrula

    # bu test case ileride dahada ayrıntılanabilir.

    * Sol menü barından Müşteri sekmesini tıkla
    * Top 10 Country grafiğinin görünür olduğunu doğrula
    * Customer Created Line grafiğinin görünür olduğunu doğrula
    * Tarayıcıyı kapat













