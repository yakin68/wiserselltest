@US_019 @smoke @all
Feature: US_019_Amazon_siparişlerini_platforma_aktarabileceği_bir_sekme_olmalı_ve_bu_sekmeyi_tıklandığında_kullanıcı_ilgili_aşamalara_yönlendirilebilmelidir

  @TC19_01
  Scenario: TC19_01 Kullanıcı, Amazon Güncelleme işlemini başarılı bir şekilde yapabilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla
    * Açılan menüden Açık sekmesini tıkla
    * Amazon Güncelleme butonuna tıkla
    * Amazon.txt ile Veri Günceleme kutusunun açıldığını doğrula
    * Dosya seç butonuna tıkla
    * Açılan pencerede ilgili dosyayı seç
    * Yükle butonuna tıkla
   # * Yükleme işleminin başarılı olduğu mesajının görünür olduğunu doğrula
   # * Ok butonuna tıkla
    * Kapat butonuna tıkla
    * Tarayıcıyı kapat