//class ATMSystem {
//    public static void main(String[] args) {
//        // ✅ Create an Object (Instance)
//        BankAccount myAccount = new BankAccount("Arjun", 2000, 1234);
//
//        // ✅ Use object methods
//        if (myAccount.validatePin(1234)) {
//            myAccount.deposit(500);
//            System.out.println("Balance: " + myAccount.getBalance());
//        }
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

// ✅ CLASS 1: BankAccount (No 'public' modifier so it fits in this file)
class BankAccount {
    private String accountHolder;
    private double balance; // ✅ lowercase
    private int pin;        // ✅ lowercase
    private ArrayList<String> transactions;

    public BankAccount(String name, double initialBalance, int pin) {
        this.accountHolder = name;
        this.balance = initialBalance;
        this.pin = pin;
        this.transactions = new ArrayList<>();
    }

    // ✅ Added missing method
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // ✅ FIXED: Add amount, not balance
            transactions.add("Deposited: $" + amount);
            System.out.println("✅ Deposit Successful");
        } else {
            System.out.println("❌ Invalid Amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // ✅ FIXED: Subtract amount
            transactions.add("Withdrawn: $" + amount); // ✅ FIXED: Message
            System.out.println("✅ Withdrawal Successful");
            return true;
        } else {
            System.out.println("❌ Insufficient Funds");
            return false;
        }
    }

    public void showHistory() {
        if (transactions.isEmpty()) {
            System.out.println("📭 No transactions yet.");
        } else {
            for (String t : transactions) {
                System.out.println(t);
            }
        }
    }
}

// ✅ CLASS 2: ATMSystem (Public, matches filename)
public class ATMsystem {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Arjun", 2000, 1234);

        System.out.println("===== Welcome to Java Bank ATM =====");

        int attempts = 3;
        boolean loggedIn = false;

        // ✅ LOGIN LOOP
        while (attempts > 0) { // ✅ FIXED: > 0
            System.out.print("Enter PIN: ");
            int inputPin = in.nextInt();

            if (myAccount.validatePin(inputPin)) {
                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("❌ Wrong PIN. Attempts left: " + attempts);
            }
        }

        if (!loggedIn) {
            System.out.println("🔒 Account Locked. Exiting.");
            return;
        }

        // ✅ MENU LOOP (Outside Login Loop)
        boolean running = true;
        while (running) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = in.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                myAccount.deposit(in.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                myAccount.withdraw(in.nextDouble());
            } else if (choice == 3) {
                System.out.println("💰 Balance: $" + myAccount.getBalance());
            } else if (choice == 4) {
                myAccount.showHistory();
            } else if (choice == 5) { // ✅ FIXED: Choice 5 for Exit
                running = false;
                System.out.println("👋 Thank you for using Java Bank.");
            } else {
                System.out.println("❌ Invalid Option");
            }
        }
        in.close();
    }
}
