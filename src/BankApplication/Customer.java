package BankApplication;

public class Customer {
    //Fields:
    public String name;

    public String accountNo;

    public String password;

    public String phone;

    public String email;

    public double balance;


    public Customer(String name, String accountNo, String password, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;

        printInformation();
    }

    public void printInformation() {
        System.out.println(
                "Name: " + name +
                        "\nAccount Number: " + accountNo +
                        "\nPhone: " + phone +
                        "\nE-mail: " + email);
    }

    public void addBalance(double amount){
        this.balance += amount;
        System.out.println("Sayin " + name + ", hesabiniza " + amount + " TL yatirilmistir.");
    }

    public void withdrawMoney(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            System.out.println("Sayin " + name + ", hesabinizdan " + amount + " TL cekilmistir.");
        }else{
            System.out.println("Para cekme islemi basarisiz. Yetersiz bakiye!!!");
        }
    }

    public void printBalance(){
        System.out.println("Bakiyeniz: " + balance);
    }

    public void changePassword(){
        // sifre degistirme islemleri
    }
}


