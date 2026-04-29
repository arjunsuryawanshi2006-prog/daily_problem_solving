import java.util.Scanner;

public class countingoccurance {
    public static void main() {
        Scanner in = new Scanner(System.in);
//        int num =in.nextInt();
//        int snum= in.nextInt();
//        int count=0;
//        while (num>0) {
//            int rem = num % 10;
//            if (rem == snum) {
//                count++;
//            }
//            num /= 10;
//        }
//         System.out.println(count);



        int Fn= in.nextInt();
        int Sn=in.nextInt();
        int count=0;

        while (Fn>0){
            int rem=Fn%10;
            if(rem == Sn){
                count++;
            }
            Fn/=10;

        }
        System.out.println(count);

    }
}