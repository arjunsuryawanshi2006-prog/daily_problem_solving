class BankAccount{
    String name;
    double balance;


    public BankAccount(String name,double initialbalance) {
        this.name=name;
        this.balance=initialbalance;

    }
    double getbalance() {
        return(balance);
    }



    void setbalance(double newbalance){
        if(newbalance > 0) {
            this.balance=newbalance;
            System.out.println("balance updated successfully ");

        }else {
            System.out.println("XX error ,balance should not be negative");
        }
    }
}
public class Gettersetterprogram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankAccount Myacc = new BankAccount("rahul",3000);

        System.out.println("current balance: "+ Myacc.getbalance());

        Myacc.setbalance(-5000);
        System.out.println("new balance= "+ Myacc.getbalance());

        //Myacc.setbalance(-500);


    }

}



