import java.util.Scanner;

public class sumofarrary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[]arr={1,5,3,9,2};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];


        }
        System.out.println("sum= "+ sum );


    }
}
