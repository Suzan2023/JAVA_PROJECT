package KahveMakinesi;
import java.util.Scanner;

public class KahveMakinesi {

    /*

1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
Örn:
Hangi Kahveyi İstersiniz?
1.Türk kahvesi
2.Filtre Kahve
3.Espresso

     String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
      (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                  todo 1. Koşul bölümü
     Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
     Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
     Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
     Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                  todo ----------------------------------

     Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

    String sut olusturun.
                                                                        todo 2.Koşul Bölümü
    eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

   eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                 todo ----------------------------------



     Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
     String seker oluşturunuz.
                                                             todo 3.Koşul Bölümü
     todo if(){
     Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
     Şeker sayısını giriniz.
     Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
     todo }
     todo else{
 Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.


         ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
String boyut oluşturun...

                                                todo 4.Koşul Bölümü
     eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

     Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)

     Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)




                 //todo  SONUÇ BÖLÜMÜ

                 Siparişlerimizi verdik. Son hali görmek istiyoruz.
                 konsola şunu yazdırın örnek :

     Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)


     todo Açıklama :

    Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
    Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.

    Bir ödev çözümü günü yapacağız. Bunun haberini ilerleyen günlerde size vereceğim.

    Ancak arkadaşlarınızla beraber Voice Channel larda ödev üzerine tartışabilirsiniz.

    HERKESE KOLAY GELSİN !!
              */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



        // Kahve secim asamasi

        // Kullaniciya hangi kahveyi istedigi sorulur ve kahve secenekleri yazdirilir.
        menuyuYazdir();
        // Kullaniciya hangi kahveyi sectigi sorulur ve alinan cevap bir degiskende tutulur.

        String kahveSecim = kahveSecimiYap();

        // Kullanicinin sectigi kahveye gore konsola bilgilendirme mesaji yazdirilir.

        System.out.println(kahveSecim + " hazirlaniyor");


        // Sut ekleme asamasi

        // Kullaniciya sut isteyip istemedigi sorulur ve cevap bir String degiskende saklanir.
        sutEkle();
        // Kullanici evet yaniti verdiyse 'Sut ekleniyor' yazdirilir, Hayir cevabi verdiyse 'sut eklenmiyor' yazdirilir

        // Seker ekleme asamasi

        // Kullaniciya seker isteyip istemedigi sorulur ve yanit evet ise kac seker istedigi sorularak konsola
        // '{sekerSayisi} seker ekleniyor'
        sekerEkle();
        // Kullanici seker istemiyorsa seker eklenmiyor mesaji yazdirilir

        // Boy secim asamasi

        // Kullaniciya secilebilecek boy bilgileri yazdirilir ve kullanicidan secim yapmasi beklenir
        String boySecim = boySecimiYap();
        // Secim buyuk boy ise Kahveniz buyuk boy hazirlaniyor

        // Secim orta boy ise Kahveniz orta boy hazirlaniyor

        // Secim kucuk boy ise Kahveniz kucuk boy hazirlaniyor

        // Sonuc asamasi
        System.out.println(kahveSecim + " " + boySecim + " olarak hazirlandi. Afiyet olsun! Yeniden bekleriz...");
        //Kullaniciya istedigi kahve ve boy bilgileri yazdirilir.






    }

    private static String boySecimiYap() {
        System.out.println("***************************************************\n\nHangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)\n\n***************************************************");
        String boySecim = sc.nextLine();

        switch (boySecim.toLowerCase()){
            case "buyuk boy":
            case "orta boy":
            case "kucuk boy":
                System.out.println("Kahveniz " + boySecim + " hazirlaniyor");
                break;

            default:
                System.out.println("Yanlis giris yaptiniz lutfen dogru boy giriniz...");
                boySecimiYap();
                break;
        }
        return boySecim;
    }

    private static void sekerEkle() {
        System.out.println("***************************************************\n\nSeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n***************************************************");

        String sekerSecim = sc.nextLine();

        if (sekerSecim.equalsIgnoreCase("evet")) {
            System.out.println("***************************************************\n\nKac seker eklememizi istersiniz?\n\n***************************************************");
            int sekerSayisi = sc.nextInt();
            sc.nextLine(); // Onemli dummy

            if(sekerSayisi>0){
                System.out.println(sekerSayisi + " seker ekleniyor.");
            }else {
                System.out.println("Yanlis girdi yaptiniz Lutfen dogru girdi yapiniz");
                sekerEkle();
            }

        } else if (sekerSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSeker eklenmiyor");
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen Evet veya Hayir yaziniz...");
            sekerEkle();
        }

    }

    private static void sutEkle() {

        System.out.println("***************************************************\n\nSüt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n***************************************************");
        String sutSecim = sc.nextLine();

        if (sutSecim.equalsIgnoreCase("evet")) {
            System.out.println("\nSut ekleniyor.");
        } else if (sutSecim.equalsIgnoreCase("hayir")) {
            System.out.println("\nSut eklenmiyor");
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen Evet veya Hayir yaziniz...");
            sutEkle();
        }
    }

    private static String kahveSecimiYap() {

        // Oyle bir method gelistir ki kullanici dogru secim yapana kadar methoddan cikamasin

        while(true){
            // kullanicidan bir girdi talep edilir  ve alinan girdi bir degiskende saklanir
            String secim = sc.nextLine();

            // Bu degiskenim eger kabul edilebilir bir girdi ise methoddan cikilir, degil ise menu tekrardan yazdirilarak dongunun basina donulur.
            if((secim.equalsIgnoreCase("turk kahvesi")) ||
                    (secim.equalsIgnoreCase("filtre kahve")) ||
                    (secim.equalsIgnoreCase("espresso"))){

                return secim;
            }else{
                System.out.println("Yanlis secim yaptiniz. Lutfen dogru bir giris yapiniz...");
                menuyuYazdir();
            }

        }


    }

    private static void menuyuYazdir() {
        System.out.println("*******************************************\n");
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1. Turk Kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");
        System.out.println("\n*******************************************\n\n");











    }
}