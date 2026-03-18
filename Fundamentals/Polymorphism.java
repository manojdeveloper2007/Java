
// Polymorphism => Many + behaviours
// Two types of polymorphism
// 1 . compile time polymorphism (method overloading)
// 2 .  run time polymorphism  (method overriding)

// Abstract => cannot idea for declaration
// abstract class can both normal methods and abstract methods,so cannot create object

abstract class Poly {
    public abstract void behaviour();
}


class Home extends Poly{
    
    // method overriding
    public void behaviour() {
        System.out.println("Father in Home");
    }

}

class Office extends Poly {

    public void behaviour() {
        System.out.println("Employee in Office");
    }

}

class Market extends Poly {

    public void behaviour() {
        System.out.println("Public Person");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Poly obj = new Home();
        obj.behaviour();

        obj = new Office();
        obj.behaviour();

        obj = new Market();
        obj.behaviour();
    }
}
