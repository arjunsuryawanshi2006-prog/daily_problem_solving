import java.util.Arrays;
import java.util.Scanner;

public class arraysofobject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int []arr = new int [5];
         arr[0]=1;
        arr[1]=102;
        arr[2]=23;
        arr[3]=432;
        arr[4]=8;
      //  System.out.println(arr[3]);

       for (int i = 0; i < arr.length ; i++) {
           arr[i]=in.nextInt();
            System.out.println(i);
     //   System.out.println(Arrays.toString(arr));//we can use tostring keword instead of for loop
        }


    }
}
