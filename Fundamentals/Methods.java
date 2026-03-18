
public class Methods{

    // Methods => Block of code
    public static int multiply(int num1,int num2){
        return num1 * num2;
    }

    // Method Overloading
    public static int multiply(int num1,int num2,int num3){
        return num1 * num2 * num3;
    }

    public static void main(String[] args){

        int result = multiply(12,4);
        System.out.println(result);

        int result2 = multiply(18, 2, 1);
        System.out.println(result2);

    }
}