import java.util.ArrayList;
public static class banktransactionshistory {

    String Accountholder;
    double balance;
    int Accountnumber;

    ArrayList<String> transaction = new ArrayList<>();

    public banktransactionshistory(String name, int initialbalance) {
        this.Accountholder= name;
        this.balance=initialbalance;

    }

    public double deposite(double amount){
        if (amount > 0){
            balance+=amount;
            transaction.add("deposited= "+amount);
            System.out.println("deposited= "+amount);

        }
        return balance;
    }
    public double withdrawl(double amount){
        if (amount > balance){
            System.out.println("invalid amount");
        } else if (amount < 0) {
            System.out.println("insufficient balance");

        }else {
            transaction.add("withdrawl= "+amount);
            System.out.println("withdrawl= "+amount);
        }
        return balance;

    }
    public void PrintHistory(){
        System.out.println("-------transactions-------");

        for (String Transaction:transaction) {
            System.out.println(Transaction);
        }


    }
    public void getLastThreeTransactions(String Transaction) {
        System.out.println("----------last three transactions----------");
        int size=transaction.size();

        int StartIndex=size-3;

        if (StartIndex < 0){
            StartIndex=0;
        }



    }


    }
    public static void main(String[] args) {
        banktransactionshistory MyAccount = new banktransactionshistory("arjun", 1300);

        MyAccount.deposite(200);
        MyAccount.withdrawl(100);
        MyAccount.deposite(300);
        MyAccount.PrintHistory();



}


