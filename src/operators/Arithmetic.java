package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 8;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

//        post increment and decrement
        num1++;
        num2--;

        System.out.println(num1);
        System.out.println(num2);

//        pre increment and decrement

        ++num1;
        --num2;

        System.out.println(num1);
        System.out.println(num2);

//        using variable
        int inc1 = num1++;

        System.out.println(num1);
        System.out.println(inc1);
        System.out.println(inc1);

        int inc2 = ++num1;

        System.out.println(num1);
        System.out.println(inc2);
        System.out.println(inc2);
    }
}
