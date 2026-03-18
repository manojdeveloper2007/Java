// create our own exception
class MyOwnException extends Exception {
    public MyOwnException (String msg) {
        super(msg);
    }
}


public class ExceptionHandling {

    public static void exception() throws MyOwnException{
        String name = "Manojj";

        if (name == "Manoj") {
            System.out.println("Hello "+name);
        }

        else {
            throw new MyOwnException("Name MisMatch");
        }

    }
    public static void main(String[] args) {
        // int num1 = 18;
        // int num2 = 0;
        // int result = 0;

        // try {
        //     result = num1 / num2;
        // }

        // catch(ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }

        // catch(Exception e) {
        //     System.out.println("Something wrong !");
        // }
        // System.out.println(result);

       
        try {
            exception();
        }
        catch(MyOwnException e) {
            System.out.println("Error : "+e.getMessage());
        }

    }
}
