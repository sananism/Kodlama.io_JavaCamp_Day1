package ders1_intro_14_9_2022;

public class Main {

    public static void main(String[] args) {

        //println(""); Konsola yazdırma işlemini yapan metod, ifadedir.
        System.out.println("Hello World!");

        System.out.println("-----------------------------------------------------------------------------------------");

        //String, metinsel bir veriyi atama, tanımlama için kullanılan bir Java Class'ıdır.
        //Değişken isimlendirmeleri Java'da camelCase şeklinde yazılır. Yani değişken ismi küçük harfle başlar.
        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade Süresii";

        //Tanımladığımız metinsel veriyi konsola yazdırmak için kullandığımız ifadedir.
        System.out.println(ortaMetin);

        System.out.println("-----------------------------------------------------------------------------------------");

        //Tamsayı verisini tanımlamak için kullanılır.
        int vade = 12;

        //Ondalık sayı veri tipini tanımlamak için kullanılır.
        double dolarDunkiDegeri = 18.14;
        double dolarBugun = 18.20;

        //Bu veri tipi türlerini true ya da false değerleriyle tanımlayabiliriz.
        //Örnek olarak web sitesi ekkranındaki bir web elementini gösterip göstermemesi için kullanılabilir.
        //true ifadesi web elementini gösterirken, false ifadesi göstermez.
        boolean dolarDustuMu = false;

        String okYonu = "";

        //if (eğer) ifadeleri boolean veri tiplerini kabul eder.
        //Aşağıdaki if ifadesinde "bugünki dolar değeri dünkü dolar değerinden düşükse" ifadesi işlenmiştir.
        //true ya da false döner. Yukarıda yaptığımız double veri tipindeki tanımlamadan dolayı;
        //dolarBugun < dolarDunkiDegeri --> false dönecektir.
        //if, else bloklarından sadece biri çalışır ama mutlaka çalışır.

        if (dolarBugun < dolarDunkiDegeri) { //if ifadesindeki şart sağlanırsa yani true dönerse aşağıdaki ifadeler çalışır.
            okYonu = "down.svg"; //true dönerse okYonu aşağıyı göster demek ister. Şarta göre veri değer kazanır.
            System.out.println(okYonu); //Bu durumda okYonu verisi yani down.svg ifadesi ekrana yazdırılır.

        } else if (dolarBugun > dolarDunkiDegeri) { //Yukarıdaki if ifadesi false dönerse ve else if ifadesindeki şart true dönerse bu bloktaki ifadeler çalışır.
            okYonu = "up.svg"; //true dönerse okYonu yukarıyı göster demek ister. Tekrardan şarta göre veri değer kazandı.
            System.out.println(okYonu); //else if ifadesi true döndüğü zaman konsola okYonu verisi yani up.svg ifadesi yazdırılır.

        } else { //if ve else if ifadelerindeki şart sağlanmazsa yani false dönerlerse, else ifadesindeki şartı kontrol eder.
            okYonu = "equal.svg"; //true dönerse şarta göre verimiz equal yani eşitlik değeri kazanır.
            System.out.println(okYonu); //Konsola okYonu verisi yani equal.svg ifadesi yazdırılır.
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        //Array, veriler listesinden oluşan ifadeleri tanımlamak için kullanıır.
        //Tek bir değişkende bütün verileri tutabiliriz.
        //Gerçek bir projede bu veriler bize DataBase'den yani veri kaynağından gelir.
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        //Kodlamada ilk eleman 0'dan başlar.
        System.out.println(krediler[0]); //Krediler Array'inin ilk elemanı
        System.out.println(krediler[1]); //2. eleman
        System.out.println(krediler[2]); //3. eleman

        System.out.println("-----------------------------------------------------------------------------------------");

        //Dinamik sistemler yapmak için döngüler kullanılırız.
        //for --> Bir şeyi bir şarta göre tekrarla demek.
        //int i = 0; --> Saymaya 0'dan başla
        //i < krediler.lenght; --> krediler değişkeni kaç elemandan oluşur. --> for döngüsü içinde ne kadar döneyim manasında kullanılır.
        //i++ --> 1er 1er arttır manasına gelir.
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]); // i yazma sebebimiz --> ilk çalışmadad krediler[0] --> 2. çalışmada krediler[1] --> 3. çalışmada krediler[2] sisteminde çalışır.
        }

    }
}