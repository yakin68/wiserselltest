
@US_023 @all @smoke
Feature: US_023_Kullanıcı_hızlı_kargo_oluşturabilmesi_için_Standart_desi_oluşturabilmelidir

  @TC23_01
  Scenario: TC23_01 Kullanıcı hızlı kargo oluşturabilmesi için "Standart desi" oluşturabilme ve silebilmelidir.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Kargo sekmesine tıkla
    * Standart Desi sekmesine tıkla
    * Standart Desi Oluştur butonuna tıkla
    * Standart Desi Oluştur alanının açıldığını doğrula
    * İsim kutucuğuna "testDesi" gir
    * Boy kutucuğuna 30 gir
    * En kutucuğuna 20 gir
    * Yükseklik kutucuğuna 10 gir
    * Ağırlık kutucuğuna 1 gir
    * Kaydet butonuna tıkla
    * Tebrikler Başarıyla kaydedildi mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Standart desi listesinde oluşturulan standart desinin görünür olduğunu doğrula
    * ilgili standart desiye ait işlemler (...) sekmesine tıkla
    * Oluşturulan standart desiyi silmek için Sil butonuna tıkla
    * Standart Desi Sil alanının açıldığını doğrula
    * Evet butonuna tıkla
    * Tebrikler ... numaralı desi başarıyla silindi mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla
    * Tarayıcıyı kapat









