import java.util.Arrays;

public class changevalue {
 public static void main() {
//   create an array
     int [] arr = {1,2,3,4,5,6};
     change(arr);
     System.out.println(Arrays.toString(arr));

 }
 static void change(int[] num){
     num[0]=99;//if you make the change to the object via this ref variable,
 }              //same object will be changed

}