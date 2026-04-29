public class scope {

    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        String name = "arjun";
    //    System.out.println(marks);
        {
            //int a =54; already initialized outside the block in the same method ,hence you can not initialize again
            a = 100;
            System.out.println(a);// reassign the origin ref variable to some other value
            int v = 50;
            //values initialized in this block, will remain in block
            name = "rahul";
            System.out.println(name);

            //scoping  for loop
            for (int i = 1; i <= 4; i += 1) {
                System.out.println(i);
                int num = 30;
//                int a =30; cannot use inside the block
            }
        }
        System.out.println(a);
        //System.out.println(v); can not used out side the box.
        System.out.println(name);


    }

    static void random(int marks) {
        int num = 56;
        System.out.println(num);
        System.out.println(marks);


    }
}