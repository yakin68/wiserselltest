@US_007 @smoke @all
Feature: US_007_Kullanıcı_login_olduktan_sonra_sayfa_hakkında_genel_bilgilerin_olduğu_karşılama_sayfasına_erişebilmelidir

  @TC07_01
  Scenario: TC07_01 Kullanıcı doğru kimlik bilgileri ile kullanıcı sayfasına erişebilmeli ve kendi profiline tanımlanan sayfanın açıldığını doğrular.

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Wisersel logosu altında Hoşgeldiniz karşılama mesajını görünür olduğunu doğrula
    * Sol alt kısımda doğru kullanıcı bilgilerinin göründüğünü doğrula
    * Sağ üst kısımda bulunan profil simgesini tıkla
    * Doğru profil bilgilerinin görünür olduğunu doğrula
    * Sayfada tanıtıcı sliderın görünür olduğunu doğrula
    * Sliderı manüel olarak sola kaydır
    * Sliderı manüel olarak sağa kaydır
    * Sayfada Duyurular alanının görünür olduğunu doğrula
    * Tarayıcıyı kapat