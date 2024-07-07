@US_018 @smoke @all
Feature: US_018_Kullanıcı_toplu_işlemler_sekmesi_üzerinden_birden_fazla_siparişe_yazıcıdan_etiket_alabilmelidir

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
    * İlk üç siparişi seç
    * Toplu işlemler sekmesini tıkla
    * Açılan menüden Toplu Etiket Olustur sekmesine tıkla

  @TC18_01
  Scenario: TC18_01 Kullanıcı seçtiği birden fazla siparişe Termal Etiket Düzeni formatında etiket alabilmelidir.
    * Termal Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat


  @TC18_02
  Scenario: TC18_02 Kullanıcı seçtiği birden fazla siparişe Ürün Bazlı A4 Etiket Düzeni formatında etiket alabilmelidir.

    * Ürün Bazlı A4 Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat

  @TC18_03
  Scenario: TC18_03 Kullanıcı seçtiği birden fazla siparişe Sipariş Bazlı A4 Etiket Düzeni formatında etiket alabilmelidir.

    * Sipariş Bazlı A4 Etiket Düzeni radio butonuna tıkla
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
    * Yazıcıdan etiket alma sayfasının açıldığını doğrula
    * Tarayıcıyı kapat