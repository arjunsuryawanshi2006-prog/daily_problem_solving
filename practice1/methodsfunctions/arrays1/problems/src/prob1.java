import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();



        int mama = getmax(a,b,c);
        System.out.println(mama);


    }
    static int getmax(int a,int b,int c){
        int num = Math.max(c,(Math.max(b,a)));
        return num;

    }
}
