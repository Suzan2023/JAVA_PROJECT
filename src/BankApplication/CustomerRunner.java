package BankApplication;

import java.util.Scanner;

public class CustomerRunner {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Customer customer1 = new Customer("Karl Ortis", "123456789", "karl123", 1000);


        //Kullaniciya hesap numarasi ve sifresi sorularak kontrol saglanir. Dogruysa sisteme giris yapilir.
        //Yanlisssa dogru bilgi girilene kadar soru tekrarlanir.

        while(true){
            yildizlarlaYazdir("BANKA UYGULAMAMIZA HOSGELDINIZ");
            System.out.print("Hesap numaranizi giriniz: ");
            String hesapInput = scanner.next();


            if(hesapInput.equals(customer1.accountNo)){
                System.out.print("Sifrenizi giriniz: ");
                String sifreInput = scanner.next();
                if (sifreInput.equals(customer1.password)){
                    System.out.println("SAYIN " + customer1.name.toUpperCase() + " HOSGELDINIZ...");
                    break;
                }else{
                    System.out.println("SIFRENIZ YANLISTIR. LUTFEN TEKRAR DENEYINIZ...");
                }
            }else{
                System.out.println("HESAP NUMARANIZ YANLISTIR. LUTFEN DOGRU BILGILERLE TEKRAR DENEYINIZ...");
            }
        }


        int devam = 1;
        //Kullanici giris yaptiktan sonra ana menude birtakim seceneklerle karsilasir.
        while(devam == 1){
            //Ana menuyu yazdir.
            anaMenu();
            //Kullanicidan islem girdisi al
            int islem = scanner.nextInt();
            //Kullanicinin girdisine gore cagirilmasi gereken methodlari cagir

            switch (islem){
                case 1:
                    bakiyeYazdir(customer1);
                    devam = devamMi();
                    break;
                case 2:
                    paraYatir(customer1);
                    devam = devamMi();
                    break;
                case 3:
                    paraCek(customer1);
                    devam = devamMi();
                    break;
                case 4:
                    devam = 0;
                    break;

                default:
                    System.out.println("Lutfen dogru islem seciniz");
                    break;
            }
        }

        yildizlarlaYazdir("BANKAMIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDER IYI GUNLER DILERIZ...");




        // 1 - Bakiye yazdir
        // 2 - Para yatir
        // 3 - Para cek
        // 4 - Cikis yap

        // Her islem sonunda kullaniciya baska bir islem yapmak isteyip istemedigi sorulacak.
        // Evet denirse menu tekrardan yazdirilarak ana menuye gidilecek
        // Hayir denir ise sistemden cikis yapilacak



    }

    private static void paraCek(Customer customer1) {
        System.out.print("Kac para cekmek istiyorsunuz? ");
        double miktarInput = scanner.nextDouble();
        if (sayiPozitifMi(miktarInput)){
            customer1.withdrawMoney(miktarInput);
        }else{
            System.out.println("Lutfen pozitif bir sayi giriniz...");
            paraCek(customer1);
        }
    }

    public static void paraYatir(Customer customer1) {
        System.out.print("Kac para yatirmak istiyorsunuz? ");
        double miktarInput = scanner.nextDouble();
        if (sayiPozitifMi(miktarInput)){
            customer1.addBalance(miktarInput);
        }else{
            System.out.println("Lutfen pozitif bir sayi giriniz...");
            paraYatir(customer1);
        }

    }

    private static boolean sayiPozitifMi(double i) {
        if (i > 0){
            return true;
        }
        return false;
    }

    public static void bakiyeYazdir(Customer customer) {
        customer.printBalance();
    }


    public static int devamMi(){
        System.out.println("Islem yapmaya devam etmek istiyor musunuz? Evet icin 1 hayir icin 0 i tuslayiniz");
        int devamInput = scanner.nextInt();
        return devamInput;
    }

    public static void yildizlarlaYazdir(String text){
        System.out.println("********************************************************************************\n\n");
        System.out.println(text);
        System.out.println("\n\n********************************************************************************\n\n");
    }

    public static void anaMenu(){

        yildizlarlaYazdir( "Lutfen yapacaginiz islemi seciniz\n\n--------------------------------\n" +
                "1 - Bakiye yazdir\n" +
                "2 - Para yatir\n" +
                "3 - Para cek\n" +
                "4 - Cikis yap" +
                "\n--------------------------------");
    }
}
