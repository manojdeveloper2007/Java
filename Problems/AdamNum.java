public class AdamNum {

    public static int reverse(int num) {
        int rev = 0;

        while(num > 0) {
            rev = rev * 10 +(num % 10);
            num/=10;
        }
        return rev;
    }

    public static int square(int num) {
        return num * num;
    }


    public static void main(String[] args) {
        int num = 12;
        int res = reverse(num);
        int sqNum1 = square(num);
        int sqNum2 = square(res);

        System.out.println(sqNum1 == reverse(sqNum2));
    }
}
