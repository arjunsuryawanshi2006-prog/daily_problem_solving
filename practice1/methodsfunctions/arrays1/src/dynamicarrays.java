import java.util.Arrays;

public class dynamicarrays {
    public static void main(String[] args) {
        int [][]arr ={
                {2,4,5,6},
                {45,63},
                {12,24,333}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf(arr[row][col] + " ");


            }
            System.out.println();
        }


    }
}
