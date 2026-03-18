// Code Converters

public class Converter {

    public static String decimalToBinary(int num){
        String binary = "";
        while(num > 0){
            int rem=num%2;
            binary=rem + binary;
            num/=2;
        }
        return binary;
    }

    public static String decimalToHexadecimal(int num){
        char[] hexadecimals = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex = "";

        while(num > 0){
            int rem = num % 16;
            hex = hexadecimals[rem] + hex;
            num/=16;
        }
        return hex;
    }

    public static void main(String[] args) {
        int num = 47;
        String res1 = decimalToBinary(num);
        String res2 = decimalToHexadecimal(num);
        System.out.println("Binary Value of "+num+" is "+res1);
        System.out.println("Hexadecimal Value of "+num+" is "+res2);
    }
}
