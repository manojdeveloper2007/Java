public class Armstrong {
    // Armstrong Number
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while(num > 0) {
            sum+=(num%10)*(num%10)*(num%10);
            num/=10;
        }

        if (temp == sum) {
            System.out.println(sum);
            System.out.println("It is Armstrong Number");
        }

        else {
            System.out.println(sum);
            System.out.println("It is not an Armstrong Number");
        }
    }
}
