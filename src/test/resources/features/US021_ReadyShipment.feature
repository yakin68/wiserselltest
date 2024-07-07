@US_021 @smoke @all
Feature: US_021_Kullanıcı_Herhangi_bir_siparişi_Kargoya Hazır_aşamasına_alabilmeli_ve_bir_sipariş_için_kargo_bilgilerini_girerek_Kargo_oluşturabilmeli_ve_oluşturduktan_sonra_ilgili_siparişin_Bekleyen_Kargolar_aşamasına_gitmeli_Kargo_için_yazıcıdan_etiket_alabilmeli_isterse_kargo_sil_yaparak_tekrar_Kargoya_Hazır_aşamasına_alabilmeli

  @TC21_01
  Scenario: TC21_01 Kullanıcı, Herhangi bir siparişi "Kargoya Hazır" aşamasına alabilmeli, bir sipariş için kargo bilgilerini girerek Kargo oluşturabilmeli ve oluşturduktan sonra ilgili siparişin "Bekleyen Kargolar" aşamasına gitmeli

    * Web tarayıcısını aç
    * Wisersell'in "URL" adresine git
    * Eğer cookies varsa kabul et
    * Login butonuna tıkla
    * E-posta kutucuğuna kayıtlı "kayitliEmail" adresini gir
    * Şifre kutucuğuna "kayitliPassword" gir
    * Giriş yap butonuna tıkla
    * Sol menü barından Sipariş sekmesini tıkla

    # * Kullanıcı, ilgili siparişin Kargoya Hazır aşamasına alabilmeli

    * Açılan menüden Açık sekmesini tıkla
    * Ürün listesinde ilk ürünün Label No'sunu kaydet
    * Ürün listesinde ilk ürünün Alıcı bilgisini kaydet
    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Durum değiştir sekmesine tıkla
    * Kargoya Hazır statüsüne tıkla
    * Kaydet butonuna tıkla
    * Tebrikler Statüler Başarıyla Güncellendi mesajının görür olduğunu doğrula
    * Ok butonuna tıkla
    * Sipariş menüsü altında Kargoya Hazır statüsünü tıkla
    * Açılan sipariş listesinde taşınan siparişin göründüğünü Label No ile doğrula

    # Kullanıcı, ilgili siparişe gerekli bilgileri girerek kargo oluşturabilmeli

    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Kargo oluştur seçeneğini tıkla
    * Kargo oluşturma alanının açıldığını doğrula
    * Boy kutucuğuna 30 gir
    * En kutucuğuna 20 gir
    * Yükseklik kutucuğuna 10 gir
    * Ağırlık kutucuğuna 2 gir
    * Gümrük bedelini 1 olarak gir
    * Fiyat Al tıkla
    * Herhangi bir kargoyu tıkla
    * Kargo ücreti 0 ise 10 gir
    * Para birimi sekmesini tıkla
    * İlgili para birimini seç
    * Gönderi tipini Tıkla
    * Gönderi tipini DAP seç ve DAP seçildiğini doğrula
    * Tip sekmesini tıkla
    * Tipi VAT seç
    * VAT IOSS Numarası kutucuğuna 370600428 gir
    * Amaç sekmesine tıkla
    * Amaç olarak herhangi bir seçeneği seç
    * Kaydet butonuna tıkla
    * Tebrikler Kargo Başarıyla Oluşturuldu mesajının görünür olduğunu doğrula
    * Ok butonuna tıkla

   # Kullanıcı, Kargo oluşturulan ürünün Bekleyen Kargolarda göründüğünü doğrular

    * Kargo sekmesine tıkla
    * Bekleyen Kargolar sekmesine tıkla
    * İlgili kargonun bekleyen kargolar sayfasında göründüğünü doğrula

    # Kullanıcı, Bekleyen Kargolardaki ürün için yazıcıdan Kargo etiketi alabilmeli

    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Kargo Etiketi Oluştur sekmesine tıkla
    * Kargo profilini seç
    * Yazıcı tipini seç
    * Eğer varsa paket tipini seç
    * Etiket Al butonuna tıkla
    * Açılan yeni sayfaya geç
   # * Yazıcıdan kargo etiket alma sayfasının açıldığını doğrula
    * Wisersell sayfasına tekrar dön

    # Kullanıcı. Bekleyen kargolardaki ürün için Kargo gönder yapabilmeli ve ürünün Gönderilmiş kargolarda göründüğünü doğrular

    * Ürün listesinde ilk ürüne ait işlemler (...) sekmesini tıkla
    * Kargo gönder sekmesine tıkla
    * Kargo gönder kutucuğunun açıldığını doğrula
    * Gönder butonuna tıkla
    * Tebrikler Kargonuz Gönderildi mesajının göründüğünü doğrula
    * Ok butonuna tıkla
    * Sol meü barında Gönderilmiş Kargolar sekmesine tıkla
    * İlgili ürünün gönderilmiş kargolar alanında görünür olduğunu doğrula
    * Tarayıcıyı kapat






