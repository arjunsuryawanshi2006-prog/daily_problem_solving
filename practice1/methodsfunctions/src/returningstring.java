import java.util.Scanner;

public class returningstring {
    public static void main() {
//       String message=  greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name:                ");
        String name=in.next();

        String personalized=mygreet(name);
        System.out.println(personalized);
    }
    static String mygreet(String name){
        String messege = ("hello " + name) ;
        return messege;
    }
}
//static String greet (){
//    String greeting = "how are you";
//    return greeting;
