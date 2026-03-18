package Inheritance;

public class Demo {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.start();
        obj.stop();
        obj.wheels();

        obj = new Bike();
        obj.start();
        obj.stop();
        obj.wheels();

        // In java multiple inheritance is not possibe,because it confuse which method
        // calls first for both methods are same in both classess
        
    }
}
