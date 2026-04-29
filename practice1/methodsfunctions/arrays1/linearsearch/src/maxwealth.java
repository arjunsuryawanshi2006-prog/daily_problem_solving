public class maxwealth {
    public static void main(String[] args) {

    }
    public int maximumwealth(int[][] account) {
//        person = row
//        account=col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < account.length; person++) {
            int sum =0;
            for (int accounts = 0; accounts < account[person].length ; accounts++) {

                sum += account[person][accounts];
            }


            if (sum > ans){
                ans=sum;
            }
        }
        return ans;
    }

}
