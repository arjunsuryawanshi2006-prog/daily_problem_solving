import java.util.Scanner;
public class pinverify {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correctPin=1234;
        int maxAttempts=3;
        int Attempts=0;
        boolean  accessGrant=false;
        System.out.println("-------SECURE LOGIN SYSTEM-------");

        while (Attempts < maxAttempts) {
            System.out.println("enter the pin   (Attempts " +(Attempts +1)+")");
            int enterPin = in.nextInt();
            if (enterPin == correctPin) {
                accessGrant = true;
                break;
            } else {
                Attempts++;
                System.out.println("wrong pin remaining attempts:"+(maxAttempts-Attempts));

            }
        }
        if (accessGrant){
            System.out.println("Access Granted , Welcome !");
        }else {
            System.out.println("Account Locked , Contact Support");
            System.out.println("try again after 24 hrs");
        }
    }

}
