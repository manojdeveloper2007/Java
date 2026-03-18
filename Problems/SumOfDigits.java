public class SumOfDigits {

    public static int sumOfDigits(int num){
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 73;
        int result = sumOfDigits(num);
        System.out.println("Sum of digit is "+result);
    }
}
