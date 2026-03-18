package OOPs_Problems;

// Polymorphism Concepts

public class Shape {

    public void draw(){

    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Rectangle extends Shape {

    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
