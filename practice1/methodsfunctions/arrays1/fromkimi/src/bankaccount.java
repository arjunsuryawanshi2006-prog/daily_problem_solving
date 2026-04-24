import java.util.Scanner;

public class bankaccount {


    String accountholder;
    double balance;
    int accountnumber;

    public bankaccount(String name, double initialbalance) {


        this.accountholder = name;
        this.balance = initialbalance;
        this.accountnumber = (int) (Math.random() * 10000);
    }

    public double deposit(double amount) {
        if (amount < 0) {
            balance += amount;
            System.out.println("invbalid amount");

        }else{
            System.out.println("deposite="+amount);
        }
        return balance;

    }
    public double withdrawal(double amount){
        if (amount > balance){
            System.out.println("invalid amount");
        }else if (amount <=0){
            System.out.println("insufficient balance");
        }else{
            System.out.println("withdrawl"+amount);
        }
        return balance;
    }
    public void showbalance(){
        System.out.println("account="+accountholder);
        System.out.println("balance="+balance);
    }
    public static void main(String[] args) {
       bankaccount myAccount = new bankaccount("arjun",1000);

        myAccount.showbalance();
        myAccount.deposit(500);
        myAccount.showbalance();
        myAccount.withdrawal(200);





    }
}