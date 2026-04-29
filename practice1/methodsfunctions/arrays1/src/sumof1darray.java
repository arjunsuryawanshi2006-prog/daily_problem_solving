public class sumof1darray {
   // public static void main(String[] args) {
//        int []c={1,2,3,4};
//        int[]
//
//        for (int i = 1; i < c.length; i++) {
//
//            c[i]+=c[i-1];
//        }
//        return c;
// Method 1: New array
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                result[i] = sum;
            }
            return result;
        }

// Method 2: In-place
        public int[] runningSumInPlace(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }



    }

