# tortoisehare_race

Bu proje, klasik **Kaplumbağa ve Tavşan Yarışı** problemini Java kullanarak konsol tabanlı bir simülasyon şeklinde gerçekleştirmektedir. Kaplumbağa (Tortoise) ve Tavşan (Hare), belirlenen kurallara göre rastgele hareket eder ve 70 birimlik parkurda yarışır.

##  Proje Amacı
Bu projenin amacı; Java programlama dilinde **nesne yönelimli programlama (OOP)** kavramlarını, kalıtım (inheritance), metot ezme (override), rastgelelik (`Random`) ve döngü tabanlı simülasyon mantığını uygulamalı olarak öğrenmektir.

##  Proje Yapısı
- **Animal**
  - Ortak özellikleri ve metotları barındıran üst sınıf
  - Yarıştaki konum bilgisini yönetir
- **Tortoise**
  - Kaplumbağanın hareket kurallarını uygular
- **Hare**
  - Tavşanın hareket kurallarını uygular
- **Race**
  - Programın giriş noktasıdır (`main`)
  - Yarışı başlatır ve parkuru konsola yazdırır

##  Özellikler
- 70 birimlik yarış parkuru
- Rastgele hareket kuralları
- Aynı konuma gelindiğinde **"OUCH!!!"** durumu
- Kazananın veya beraberliğin ekrana yazdırılması
- Konsol üzerinden anlık yarış takibi

##  Çalıştırma
1. Projeyi bir Java IDE’sinde (IntelliJ IDEA, Eclipse vb.) açın.
2. `Race.java` dosyasını çalıştırın.
3. Yarışın konsol çıktısını takip edin.

##  Kazanımlar
Bu proje sayesinde:
- Java’da kalıtım ve polymorphism kullanımı
- `Random` sınıfı ile olasılıksal hareket modelleme
- Döngü ve koşul yapılarıyla simülasyon geliştirme
- Basit konsol tabanlı görselleştirme

##  Geliştirme Fikirleri
- Yarış uzunluğunu dinamik hale getirme
- Tur sayısını sayarak istatistik üretme
- Hareket kurallarını zorluk seviyelerine ayırma
- Basit bir grafik arayüz ekleme
