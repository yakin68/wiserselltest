#@US_026 @all @smoke
Feature: US_026_Kullanıcı_ürün yönetimi yapabilmeli

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla

  @TC26_01
  Scenario: TC26_01 Kullanıcı yeni kategori ekleyebilmeli

    * Kullanici browser kismindan Urun sekmesine tiklar
    * Kullanici Urun sekmesi altindaki Urun Kategorileri butonuna tiklar
    * Kullanici Urun Kategorileri sayfasindaki Kategori Ekle butonuna tiklar
    * Kullanici Kategori Ekle Guncelle penceresine kategori adini girer
    * Kaydet butonuna tıkla
    * Kullanici OK butonuna tiklar
    * Kullanici kategorinin eklendigini dogrular
    * Logout butonuna tıkla
    * Tarayıcıyı kapat


  @TC26_02
  Scenario: TC26_01 Kullanıcı kategori güncelleyebilmeli

  @TC26_03
  Scenario: TC26_01 Kullanıcı kategori silebilmeli


  @TC26_04
  Scenario: TC26_01 Kullanici, "Urun Kategorileri" sayfasinda kategori degisikligi yapabilmeli


  @TC26_05
  Scenario: TC26_01 Kullanici, "Urun Listesi" sayfasinda yeni urun olusturabilmeli


  @TC26_06
  Scenario: TC26_02 Kullanıcı yeni ürün güncelleyebilmeli, QR code üretebilmeli


  @TC26_07
  Scenario: TC26_03 Kullanıcı sipariş listesinde istediği siparişe ürün eşleştirmesi yapabilmeli



