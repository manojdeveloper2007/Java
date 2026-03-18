package OOPs_Problems;

// Inheritance concepts

public class Vehicle {
    
    protected String brand;

    public void start() {

    }
}

class Car extends Vehicle {

    protected int speed;

    public void start() {
        System.out.println("Engine Start");
    }
}
