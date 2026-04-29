import java.util.Scanner;

public class switchstatements {
    public static  void main() {

        Scanner in = new Scanner(System.in);
        //this is enhanced switch statements:
        //       String fruits=in.next();

//        switch (fruits) {
//            case "apple" -> System.out.println("a sweet fruit");
//            case "mango" -> System.out.println("king of fruits");
//            case "orange" -> System.out.println("round fruit");
//            default -> System.out.println("enter the proper fruit name");
//        }
        //this is switch statements:
        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekday");
                break;
            case 7:
                System.out.println("weekends");
                break;
        }
    }
    }
