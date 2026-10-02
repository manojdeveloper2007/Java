package typeConversion;
import java.lang.*;

public class Casting {
    public static void main(String[] args) {
        int a = 210;
        byte b = (byte) a;      //Explicit type conversion ( casting )

        float f = a;            // Implicit type Conversion ( conversion )

        System.out.println(b);
        System.out.println(f);

//        type promotion
        byte num1 = 12;
        byte num2 = 40;

        int result = num1 * num2;
        System.out.println(result);
    }
}
