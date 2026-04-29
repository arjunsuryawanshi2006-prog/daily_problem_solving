import java.util.Arrays;

public class problem2 {
    public static void main(String[] args) {
        int[] num = {23, 34, 24, 53, 55, 32};

//        point origional array
        System.out.println(Arrays.toString(num));
        int maximum = findmax(num);
        System.out.println(maximum);

    }

    static int findmax(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {

            if (num[i] > max) {

                max = num[i];
            }

        }
        return max;

    }
}