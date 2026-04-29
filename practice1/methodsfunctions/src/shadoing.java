public class shadoing {

    static int x =90;//this will be shadowed at line no 7
    public static void main(String[] args) {
        System.out.println(x);
        int x;//the class variable at line 3 is showed by this
   //     System.out.println(x);//scope will begin when value is initiated
        x = 40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
