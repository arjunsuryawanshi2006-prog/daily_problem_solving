import java.util.Scanner;

public class amstrongnumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        boolean aam = isamstrong(153);
//        System.out.println(aam);
        for (int i = 100; i < 1000; i++) {
            if (isamstrong(i));{
                System.out.println(i + " ");
            }
        }

    }
    static boolean isamstrong(int n){
        int origionalno=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            n/=10;
            sum=sum + rem*rem*rem;

        }
        return sum==origionalno;
    }
}
