import java.util.Scanner;

public class fibonaccinumber {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a =in.nextInt();
        int b=in.nextInt();
        int count = 2;

        while(count <=n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
