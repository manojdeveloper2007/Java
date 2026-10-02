package conditionalStatement;

public class Conditional {
    public static void main(String[] args) {
//        if,else if ,else
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        else if(age < 18) {
            System.out.println("You are not eligible to vote");
        }

        else{
            System.out.println("Invalid age");
        }

//        switch statement
        int weekday = 3;

        switch (weekday) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Weekday");
                break;
        }
//        Ternary operator

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(result);
    }
}