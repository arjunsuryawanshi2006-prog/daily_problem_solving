import java.util.Scanner;

public class newaskmarkandgrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int count = in.nextInt();

        float total_marks = 0;
        for (int i = 1; i < count; i++) {
            total_marks += in.nextInt();
            System.out.println(" total marks: " + total_marks);
        }
        float percentage = total_marks/count;
        switch ((int) percentage / 10){
            case 9->System.out.println("grade: A");
            case 7,8-> System.out.println("grade:B");
            case 6-> System.out.println("grade C");
            default-> System.out.println("Grade D");

        }



    }
}
