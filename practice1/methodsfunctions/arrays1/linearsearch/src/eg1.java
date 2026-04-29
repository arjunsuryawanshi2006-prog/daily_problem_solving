import java.util.Arrays;

public class eg1 {
    public static void main(String[] args) {
        int[][]accounts= {
                {1, 2, 3},
                {3, 2, 1}
        };
        int rich=MaximumWealth(accounts);
        System.out.println(Arrays.deepToString(accounts));
        System.out.println("richest person has wealth is :" +rich);

    }
    public static int MaximumWealth(int[][]accounts){
        int rich=0;
        for (int []i:accounts){
          int sum=0;
          for (int money:i){
              sum+=money;
          }
          rich=Math.max(rich,sum);
        }
        return rich;
    }
}
