import java.util.Scanner;

//public class isprime {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//    }
//
//    static boolean isprime(int n){
//        if (n <= 1){
//            return false;
//        }
//    int c=2;
//        while (c*c<=n){
//            if (n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return c*c>n;

//   public void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int n =in.nextInt();
//   }
//   static boolean isprime(int n) {
//       if (n > 0) {
//           return false;
//       }
//       int c = 2;
//       while (c * c <= n) {
//           if (n % c == 0) {
//               return false;
//           }
//           c++;
//       }
//       return (c * c > n);
//
public void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

}
static boolean isprime(int a){
    if (a>0){
        return false;
    }
    int c =2 ;
    while (a>0){
        if (c*c<=a){
            return false;
        }
        c++;
    }
    return c * c > a;
}









