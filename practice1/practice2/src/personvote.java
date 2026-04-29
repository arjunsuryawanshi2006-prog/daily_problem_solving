import java.util.Scanner;

public class personvote {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 18){
            System.out.println("you are eligible for voting ");
        }else{
            System.out.println("you are not eligible to vote");
        }
    }
}
