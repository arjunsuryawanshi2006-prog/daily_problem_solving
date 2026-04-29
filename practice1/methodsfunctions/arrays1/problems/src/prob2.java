import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(iseven(a));



    }
    static boolean iseven(int a){
//        if (a%2==0){
//            return true;
//        }else {
//            return false;
//            }
        return  a %2 == 0;

    }
}
