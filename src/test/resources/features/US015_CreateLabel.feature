@US_015 @smoke @all
Feature: US_015_Kullanıcı_istediği_siparişe_yazıcıdan_etiket_alabilmelidir

  Background:
    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Açılan menüden Etiket Olustur'a tıkla


  @TC15_01
  Scenario: TC15_01 Kullanıcı istediği siparişe Thermal Etiket Düzeninde etiket albilmelidir

    * Termal Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat

  @TC15_02
  Scenario: TC15_01 Kullanıcı istediği siparişe Ürün Bazlı A4 Etiket Düzeninde etiket albilmelidir

    * Ürün Bazlı A4 Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat

  @TC15_02
  Scenario: TC15_01 Kullanıcı istediği siparişe Sipariş Bazlı A4 Etiket Düzeninde etiket albilmelidir

    * Sipariş Bazlı A4 Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat

