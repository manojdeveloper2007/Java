import java.math.BigDecimal;

public class BigDec {
    public static void main(String[] args) {
        // BigDecimal class are used to give accurate values for long precise values
        // Float and double are give inaccurate value
        // For example

        double a = 1.2;
        double b = 1.3;
        System.out.println(a-b);
        // It misses the accuracy

        BigDecimal num1 = new BigDecimal("104671.3985824");
        BigDecimal num2 = new BigDecimal("154632.7743283");

        BigDecimal addNums = num1.add(num2);

        // Example for Banking related
        BigDecimal salary = new BigDecimal("250000.10");
        BigDecimal debited = new BigDecimal("2000.03");

        BigDecimal totalSalary = salary.subtract(debited);

        System.out.println("Addition : "+addNums);
        System.out.println("Total Balance : "+totalSalary+" $");

        // For Integers we use BigInteger class
        // It cannot be overflow ,
        // Long and Int be overflow,so biggers sizes are use this class
    }
}
