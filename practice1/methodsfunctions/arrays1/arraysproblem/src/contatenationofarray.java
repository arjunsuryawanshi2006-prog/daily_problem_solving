import java.util.Arrays;
public class contatenationofarray {

    public static void main(String[] args) {
//        int[] arr={12,32,37};
//        int[]brr={11,23,86};
//         int [] result= new int[arr.length + brr.length];
//          System.arraycopy(arr,0,result,0,arr.length);
//          System.arraycopy(brr,0,result, arr.length,brr.length);

//          for (int x:result){
//              System.out.printf(x + " ");
//          }
//        System.out.println(Arrays.toString(result));


        int []a={12,32,43567,643,2,12};
        int []b={44,32};
        int[]result=new int[ a.length + b.length];

        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);

        System.out.println(Arrays.toString(result));














    }
}
