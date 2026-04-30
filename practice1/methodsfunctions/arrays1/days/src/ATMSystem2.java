import java.util.ArrayList;
import java.util.Scanner;

class BankAccount{
    private String accountHolder;
    private double Balance;
    private int pin;
    private ArrayList<String> transactions;



    public BankAccount(String name, double initialbalance,int pin) {
        this.accountHolder=name;
        this.Balance=initialbalance;
        this.pin=pin;

    }
    public Boolean validatePin(int inputpin) {
        return this.pin==inputpin;
    }
    public double getBalance() {
        return Balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            Balance+=amount;
            transactions.add("deposited $ "+amount);
            System.out.println(amount);
        }else {
            System.out.println("xxx error , amount should be positive");
        }
    }
    public Boolean withdraw(double amount) {
        if(amount > 0) {
            Balance-=amount;
            transactions.add("withdrawal: "+amount);
            System.out.println("withdrrawal: "+amount);
            return true;
        }else {
            System.out.println("insufficient balance!!!");
            return false;

        }
    }
    public void showTransactions() {
        if(transactions.isEmpty()) {
            System.out.println("Not yet transaction done");
        }else {
            for(String t:transactions) {
                System.out.println(t);
            }
        }
    }

//✅ CLASS 2: Child Class (SavingsAccount) - DAY 10 FEATURE
}

class savingAccount extends BankAccount{
    private double intrestRates;
    private double withdrawalLimit;
    Scanner in = new Scanner(System.in);

    public savingAccount(String name,double initialbalance,int pin,double rate,double limit) {
        // ✅ super() calls the Parent (BankAccount) constructor
        super(name,initialbalance,pin);
        this.intrestRates=rate;
        this.withdrawalLimit=limit;

    }
    public void addIntrest() {
        double interest = getBalance()  * (intrestRates / 100);
        deposit(interest);// Reuse parent's deposit method
        System.out.println("interest added !!"+ interest);

    }

    public Boolean withdraw(double amount) {
        if(amount > withdrawalLimit) {
            System.out.println("exceed the daily limit"+withdrawalLimit);
            return false;

        }
        return super.withdraw(amount);
    }
}

public class ATMSystem2 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        savingAccount myAccount = savingAccount("arjun", 500,5454,5.0,500);
        System.out.println("=====Welcome to java bank(saving)");

        int attempts=3;
        Boolean loggedIn = false;

        while(attempts>0) {
            System.out.println("enter the pin: ");
            int inputpin=in.nextInt();

            if(myAccount.validatePin(inputpin)) {
                loggedIn=true;
                break;
            }else {
                attempts --;
                System.out.println("wrong pin.attempt lefts"+attempts);

            }

        }
        if(! loggedIn) {
            System.out.println("account locked ,existing");
            return;

        }
        boolean running=true;
        while(running) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Deposite");
            System.out.println("2. withdrawal");
            System.out.println("3. check balance");
            System.out.println("4. transaction history");
            System.out.println("5. Add Interest(saving features)");
            System.out.println("6. Exit");
            System.out.print("choose option");


            int choice=in.nextInt();

            if(choice==1) {
                System.out.println("enter the deposite:  ");
                myAccount.deposit(in.nextDouble());

            }else if(choice==2) {
                myAccount.withdraw(in.nextDouble());

            }else if(choice==3) {
                System.out.println("balance= "+myAccount.getBalance());

            }else if(choice==4) {
                myAccount.showTransactions();

            }else if(choice==5) {
                myAccount.addIntrest();
            }else if(choice==6){
                running=false;
                System.out.println("thank you for using java bank");

            }else {
                System.out.println("invalid option");

            }






        }





    }
    private static savingAccount savingAccount(String string, int i, int j, double d, int k) {
        // TODO Auto-generated method stub
        return null;
    }

}

