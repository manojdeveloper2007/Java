package operators;

public class Logical {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 2;

        int x = 20;
        int y = 20;

        boolean result1 = (num1 % num2 == 0) && (x == y);

        boolean result2 = (num1 != num2) || (x > y);

        boolean result3 = !(num1 != num2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
