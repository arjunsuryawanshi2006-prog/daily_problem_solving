import java.util.Arrays;

public class arraysinfunction {
    public static void main(String[] args) {
        int []num = {12,13,234,984,763};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));


    }
    static void change(int[] arr){
        arr[2]= 99;
    }
}
