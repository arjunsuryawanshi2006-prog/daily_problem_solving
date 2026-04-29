public class findeven {
    public static void main(String[] args) {
        int []num = {12,345,2,6,7896};
//        System.out.println(digits(23445));


    }

    static boolean  even(int num){
           int numberOfDigit= digit( num);
        return numberOfDigit % 2 ==0;
    }
    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

}



