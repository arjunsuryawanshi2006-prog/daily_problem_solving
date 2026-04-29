import java.util.Arrays;
public class minimumnumber {
    public static void main(String[] args) {
        int[]srr={12,23,45,5,32,4,57};
        int max= Arrays.stream(srr).max().getAsInt();

        System.out.println("max: "+max);

        int []arr ={23,45,2,24,5,55,};
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println("min "+ min);


    }
}
