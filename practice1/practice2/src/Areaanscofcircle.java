import java.util.Scanner;

public class Areaanscofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius: ");
        int radius = in.nextInt();

        double area =0;
        double pi=3.14;
         area = (radius * radius) * 3.14;
            System.out.println("area of circle is: " + area);

         double occurances=0;
         occurances= 2*radius * pi;
        System.out.println("occurance of the circle is :"+ occurances);

//        if (area==2 * 3.14 * radius) {
//            System.out.println("occurance of circle is: "+area);
//        }
    }
}
