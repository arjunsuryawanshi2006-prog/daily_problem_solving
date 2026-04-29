import java.util.Arrays;

public class minmaxinjava {
    public static void main(String[] args) {

        int []arr={1,23,4,5,7,7,89,67,80,6};
            int max= Arrays.stream(arr).max().getAsInt();
            int min= Arrays.stream(arr).min().getAsInt();
            System.out.println("max value= "+max);
            System.out.println("min value= "+min);

    }
}
