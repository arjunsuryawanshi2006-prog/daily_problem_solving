import java.util.Scanner;

public class sum {
     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

         System.out.println("enter the number: ");
         int num1=in.nextInt();
         System.out.println("enter the number: ");
         int num2=in.nextInt();

         int sum=num1 + num2;
         System.out.println("sum of numbers is "+sum);
    }
}
