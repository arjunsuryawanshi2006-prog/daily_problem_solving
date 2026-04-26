import java.util.ArrayList;
import java.util.Scanner;


public class ATMsystem {


    static int correctPin = 1234;
    static double balance = 2000;
    static ArrayList<String> transactions = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        if (!login()) {
            System.out.println("access denied");
            return;
        }
        boolean running = true;

        while (running) {
            showMenu();
            int choice = in.nextInt();

            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdrawal();
            } else if (choice == 3) {
                checkBalance();
            } else if (choice == 4) {
                showHistory();
            } else if (choice == 5) {
                running = false;
                System.out.println("thank you for using atm");
            } else {
                System.out.println("invalid option");
            }
        }
    }//login with 3 at\

    public static boolean login() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("enter pin: ");
            int pin = in.nextInt();

            if (pin == correctPin) {
                System.out.println("login sucessful");
                return true;
            } else {
                System.out.println("wrong pin . Attempts left:" + attempts);
            }
        }
        return false;

    }
    public static void showMenu(){
        System.out.println("\n----ATM MEnu-----");
        System.out.println("1.Deposite");
        System.out.println("2.withdrawl");
        System.out.println("3.Check Balance");
        System.out.println("4.Transaction History");
        System.out.println("5. exit");
        System.out.println("choose option: ");
    }
    public static void deposit(){
        System.out.println("enter the amount to deposite: ");
        double amount=in.nextInt();

        if (amount >0){
            balance +=amount;
            transactions.add("deposited= "+amount);
            System.out.println("transactions= "+amount);
        }else {
            System.out.println("invalid amount");
        }
    }
    public static void withdrawal(){
        System.out.println("enter amount to withdraw: ");
        double amount =in.nextDouble();

        if (amount <= 0){
            System.out.println("invalid amount");
        } else if (amount > balance) {
            System.out.println("insufficient balance");
        } else{
               balance-=amount;
               transactions.add("withdrawn: "+ amount);
            System.out.println("withdrawal sucessful");
            }
        }
        public static void checkBalance(){
            System.out.println("current balance: "+ balance);
    }
    public static void showHistory(){
        if (transactions.isEmpty()){
            System.out.println("no transaction yet");
        }else{
            System.out.println("transaction history:");
            for (String t :transactions){
                System.out.println(t);
            }
        }
    }

}


