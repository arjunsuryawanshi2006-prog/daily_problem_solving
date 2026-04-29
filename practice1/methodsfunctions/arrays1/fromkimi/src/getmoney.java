import java.util.Scanner;

public class getmoney {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("what is your salary  : ");
        double salary = in.nextDouble();

        if (salary > 5000){
            System.out.println("you are in rich restarunt ,buy cofee .");

        }else {
            System.out.println("earn more ,developer !");
        }

    }
}
