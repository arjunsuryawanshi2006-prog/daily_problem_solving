public class rangearrayeg {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,56};
        int target=3;
        System.out.println(linearsearch(arr,target,1,4));
    }
    static int linearsearch(int[]arr,int target, int start ,int end){
        if (arr.length==0){
            return -1;

        }
        for (int index = 0; index <arr.length ; index++) {
            int element = arr[index];
            if (element == target){
                return index;

            }
        }
        return -1;
    }
}
