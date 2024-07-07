
@US_022 @all
Feature: US_022_Kullanıcı_daha_önce_entegrasyonunu_yaptığı_kargo_şirketlerine_ait_Kargo_Bölge_Fiyat_Tanımlaması_yapabilmelidir

  @TC22_01
  Scenario: TC22_01 Kullanıcı daha önce entegrasyonunu yaptığı kargo şirketlerine ait "Kargo Bölge/Fiyat Tanımlaması" yapabilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Kargo sekmesine tıkla
    * Bölge Fiyat Tanımlama sekmesine tıkla
    * Kargo hesabı kutucuğunu tıklayarak açılan drop down menüden kayıtlı bir kargo hesabı seç
    * Seçilen kargo hesabı bilgisimi kaydet
    * Excel ile Bölge Tanımlama butonuna tıkla
    * Excel İle Bölge Fiyat Tanımlama alanının açıldığını doğrula
    * Firma kutucuğuna kaydedilen kargo hesabına kargo firmasını seç
    * Kargo kimliği kutucuğuna kaydedilen kargo hesabını seç
    * Dosaya seç butonuna tıkla
    * İlgili excell dosyasını seç
    * Yükle butonuna tıkla
    * Tebrikler Dosya Yükleme Başarılı mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Tarayıcıyı kapat


