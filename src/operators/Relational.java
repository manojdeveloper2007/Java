package operators;

public class Relational {
    public static void main(String[] args) {
        int x = 19;
        int y = 15;

        boolean isGreaterThanX = x > y;
        boolean isLessThanX = x < y;

        int a = 21;
        int b = 21;

        boolean isGreaterThanEqual = a >= b;

        boolean isEqual = a == b;

        boolean isNotEqual = x != y;

        System.out.println(isGreaterThanX);
        System.out.println(isLessThanX);
        System.out.println(isGreaterThanEqual);
        System.out.println(isEqual);
        System.out.println(isNotEqual);

    }
}
