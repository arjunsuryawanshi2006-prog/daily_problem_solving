import java.util.Arrays;

public class eg2 {
    public static void main(String[] args) {
        int []num={1,2,4,5,6,7,};
        int n=3;
        int[] result=Shuffle(num,n);
        System.out.println("shuffled arrays= "+ Arrays.toString(result) );

    }
    public static int[] Shuffle(int[]num, int n){
        int[]ans=new int[2*n];
        int x=n;//size of length of array

        for (int i = 0; i < 2*n; i+=2) {
            ans[i]=num[i/2];//take from first half
            ans[i+1]=num[x++];//take from 2nd half

        }
        return ans;


    }

}
