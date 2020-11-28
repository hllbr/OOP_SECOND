/*
OOP = object oriented programing
gerçek hayatı programlama dünyasına uyarlamak olarak düşünülebilir.
**********************
obje = ?
mouse , klavye ,monitör, kasa, kumanda ,telefon bunların her birinin içinde özellikleri ve metodları var
televizyon kumandası örnek verilirse,
üzerinde birden fazla tuş bulunmakta herbirinin işlevi farklı
kumandanın şekli,merkası,rengi  özellikerimizi oluşturuyor.
kumanda üzerinde kırmızı tuşa bastığınızda tv nin açılması yada kapanması tv kumandasının fonksiyonel özellikeri oluyor.(Fonksiyonları ve metodları oluyor...)
Programlama dünyasında da birçok objemiz veya nesnemiz var örnek...
Bir süpermarket otomasyonu yaptığınızı düşünün bu mağazada tezgahtar, mağaza müdürü,reyon sorumlusu gibi objelerimiz var bunların çiinde birçok özellikleri ve metodları var
bu vb. durumlar için programlama yapacaksanız oop'tan yararlanmanız gerekiyor.
**********************
class veya sınıf ne anlama geliyor ? 
class veya sınıf bizim için gerçek hayattaki fabrikalar gibi 
fabrikalarda bir ürünün özelliği(metodları bellidir.)
her ürünün özelliği ve metodu ürün oluşturulduğu zaman yani o fabrikadan bir tane obje oluşturulduğu zaman direkt olarak o objeye yüklenir.
o objenin özellikleri classlardada mevcuttur.
biz classlara özellikler veya methodlar ekleriz ve bu classlardan objeler oluşturacaksak objeler bu özelliklerin hepsine sahip olur.
classlar bu anlamlara geliyor.

*/
public class Araba {/*
    bizim burada en çok dikkat edececeğimiz unsur erişim belirleyiciler
    public 
    private 
    protected
    bir özelliği public yaptığımız zaman başka java dosyalarından bu özelliğe direkt olarak erişebiliyoruz.
    Ancak private şekilde tanımlamış olsaydık başka java dosyalarından bu dosyaya doğrudan erişim sağlayamıyoruz 
    (dolaylı yollardan erişim sağlamamız gerekiyor...)
    */
    //araba sınıfımızın özelliklerini bu alana ekliyoruz
    private String renk ;
    private int kapılar ;
    private int tekerlekler;
    private String motor;
    private String model;
    private String çekiş_gücü;
    private double fiyat;
    //bir adet araba nesnesi oluşturduğumuzda bu nesne bu özelliklerin tamamına sahip olacak 
    public void setModel(String model){//değere atama yapabilmek için kullanılan alan
        this.model = model;
        
    }
    public String getModel(){//değeri çağırabilmek için kullanılan alan 
        return this.model;
        
    }
    
    /*
    javada setter ve getter özel metodlar 
    javada özelliklere erişmek için özellikleri almak için kullanılan bir yöntemdir.
    
    */

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapılar
     */
    public int getKapılar() {
        return kapılar;
    }

    /**
     * @param kapılar the kapılar to set
     */
    public void setKapılar(int kapılar) {
        if(kapılar<=0){
            System.out.println("Kapı sayısı 0 'dan küçük veya 0'a eşit olamaz");
        }else{
            this.kapılar = kapılar;
        }

    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the çekiş_gücü
     */
    public String getÇekiş_gücü() {
        return çekiş_gücü;
    }

    /**
     * @param çekiş_gücü the çekiş_gücü to set
     */
    public void setÇekiş_gücü(String çekiş_gücü) {
        this.çekiş_gücü = çekiş_gücü;
    }

    /**
     * @return the fiyat
     */
    public double getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
}
