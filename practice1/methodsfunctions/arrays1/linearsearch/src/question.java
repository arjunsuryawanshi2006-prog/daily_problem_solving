public class question {
    public static void main(String[] args) {

        String name = "kunal0";
        char target='u';
        System.out.println(searchname(name,target));
    }
    static boolean searchname(String str,char target){
        if (str.length() == 0 ) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(1)){
                return true;

            }

        }
        return false;



    }
}
