public class Oddify {

    // Here Negative Values are chance for input
    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        boolean res1 = isOdd(-3);
        boolean res2 = isEven(-3);
        System.out.println(res1);
        System.out.println(res2);
    }
}
