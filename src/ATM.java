import java.util.Scanner;

public class ATM {
    float balance=1000;
     int pin=5674;



   public void checkPin() {
       System.out.println("Please Enter your PIN");
       Scanner sc = new Scanner(System.in);
       int enteredPin = sc.nextInt();
       if (enteredPin == pin) {
           menu();
       } else {
           System.out.println("Please Enter a valid PIN");
       }
   }
   public void menu(){
       System.out.println("Enter your Choice");
       System.out.println("1. Check A/c balance");
       System.out.println("2. Withdraw Money");
       System.out.println("3. Deposit Money");
       System.out.println("4.EXIT");
       
       Scanner sc=new Scanner(System.in);
       int opt = sc.nextInt();
       if (opt==1){
           checkBalance();
       } else if (opt==2) {
           withdrawMoney();
       } else if (opt==3) {
           depositMoney();
       } else if (opt==4) {
           System.out.println("EXIT DONE !");
       } else {
           System.out.println("Enter a Valid number");
       }
   }
    public void checkBalance() {
        System.out.println("Balance: "+balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount to be withdraw");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>balance){
            System.out.println("Insufficient balance");
        }
        else {
           balance=balance-amount;
            System.out.println("Money withdrawn successfully "+balance);
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount to deposit");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Monet deposited successfully "+balance);
        menu();
    }

}

