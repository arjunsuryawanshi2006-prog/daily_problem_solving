public class linearsearch {
    public static void main(String[] args) {
        int []nums={12,13,54,6,78,86,34,32};
        int target=123;
        int ans=linearsearch(nums,target);
        System.out.println(ans);


    }
//search inarray :return the indexnif item found
//    otherwise item not found return -1
    static int linearsearch(int[]arr, int target) {
        if (arr.length == 0) {
        return -1;
        }


//    fun for loop

        for (int index = 0 ; index < arr.length ; index++) {
            int element = arr[index];//check for element at every index if it is =target
            if (element == target) {

                return index;
            }
        }
        return -1;
    }

}
//this line will execute if none of the return statements above have executed
//hence the target not found



