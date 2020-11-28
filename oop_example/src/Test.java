
public class Test {
    /*
    burada oluşturduğumuz araba classından objeler oluşturacağız...
    
    */
    public static void main(String[] args) {
        /*
        eğer projelerin bir jar dosyası değilse (arşiv olarak kullanmayacaksan)
        bir defa dahi olsa main matodunun olması gerekiyor ,
        bizim araba objemizi tutacak referansa ihtiyacımız var

        */
       /*
        //özelliğe erişmek için referansı kullanıyoruz.
       araba1.renk = "red";
       araba1.kapılar =2;
       araba1.model="chiron";
       araba1.fiyat = 50000000;
       araba1.çekiş_gücü ="1500 PS or 1480 bhp or 1103 kW @ - rpm";
       System.out.println(araba1.renk);
       //javada detayların programcıdan ve kullanıcıdan saklanması olayına uncapsulation denir..
       Araba araba2 = new Araba();
       araba2.model = "veyron";
       araba2.kapılar = 2;
       araba2.renk ="dark blue";
    
       */
       //özelliğe erişmek için referansı kullanıyoruz.
        Araba araba1 = new Araba();//obje oluşturmak için new anahtar kelimesini kullanıyoruz...
        araba1.setModel("veyron");
        System.out.println("arabanın modeli = " +araba1.getModel());
        araba1.setKapılar(+2);
        System.out.println("aracımızın kapı sayısı : "+araba1.getKapılar());
        Araba araba2 = new Araba();
        System.out.println("2. aracımızın kapı sayısı : "+araba2.getKapılar());
        //bir referansa obje ataması yapmazsanız ve direkt ulaşmaya çalışırsanız java size sıkıntı çıkarır.
        Araba araba3 = null;
        //javada bu null = bu referans şuan herhangi bir yeri göstermiyor anlamına geliyor.
        //bu bir üst satırda karşılaşılan hatayla karşılaşmamızı engelliyor.
        //burdada ilerleyen satırlarda atama hatası alabilirsin bir fiyat yazdın ve sonuç almak istiyorsun sana nullpointexception hatası verir android programlamada karşına bolca çıkacak bir sorun.
        
        
        
    
      
    
    }
}
