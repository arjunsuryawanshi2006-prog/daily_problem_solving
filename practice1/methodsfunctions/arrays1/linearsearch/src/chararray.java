import java.util.Arrays;

public class chararray {
    public static void main(String[] args) {
        String name = "Arjun";
        char target = 'u';

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searrch2(String srr, char target) {
        if (srr.length() == 0) {
            return false;
        }
        for (char ch : srr.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
