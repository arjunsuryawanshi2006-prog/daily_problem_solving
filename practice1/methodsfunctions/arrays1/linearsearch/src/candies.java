import java.util.ArrayList;
import java.util.List;

public class candies {
    public static void main(String[] args) {
        int[]Candies={2,3,5,1,3};
        int extraCandies=3;

        Solution obj = new Solution();
        List<Boolean> result = (obj.KidsWithCandies(Candies,extraCandies));
        System.out.println(result);



    }
    static class Solution {
        public List<Boolean> KidsWithCandies(int[] candies, int extraCandies) {
            int Maxcandies = 0;
            //find Maximum
            for (int Candy : candies) {
                Maxcandies = Math.max(Candy, Maxcandies);
            }
            //check each kid
            List<Boolean> result = new ArrayList<>();
            for (int candy : candies) {
                if (candy + extraCandies >= Maxcandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }
            return result;

        }

    }
}
