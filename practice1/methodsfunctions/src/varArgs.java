import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {

//      fun(12,33,34,566,65,32);
        multiple(123,342,"arjun","abhishek");
    }
    static void multiple(int a,int b,String  ...v) {

    }





    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
