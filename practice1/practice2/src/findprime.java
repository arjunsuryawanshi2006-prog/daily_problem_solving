import java.util.Scanner;

public class findprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = in.nextInt();

//        if (num <= 1) {
//            System.out.println("not aprime number");
//            return;
//        }
//        boolean isprime = true;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num == 0) {
//                isprime = false;
//                break;
//            }
//        }
//        if (isprime) {
//            System.out.println("number is prime");
//        } else {
//            System.out.println("not prime");
//        }
        if (num <= 1){
            System.out.println("not prime");
            return;
        }
        boolean isprime = true;
        for ( int i=2; i <= Math.sqrt(num);i++){
            if (num == 0){
                isprime = false;
                break;
            }
        }
        if (isprime){
            System.out.println("number is prime");
        }else{
            System.out.println("not prime number ");
        }








    }
}
