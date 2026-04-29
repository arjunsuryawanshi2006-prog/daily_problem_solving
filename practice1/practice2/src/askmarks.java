import java.util.Scanner;

public class askmarks {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the marks out of 100: ");
        float marks=in.nextFloat();

        if (marks >=91){
            System.out.println("grade:AA");
        } else if (marks >=81) {
            System.out.println("grades:AB");
        } else if (marks >=71 ) {
            System.out.println("grades:BB");
        } else if (marks>=61) {
            System.out.println("grades:BC");
        } else if (marks >= 51) {
            System.out.println("grades:CD");
        } else if (marks >= 41) {
            System.out.println("grades:DD");
        }else {
            System.out.println("fail");
        }
    }
}
