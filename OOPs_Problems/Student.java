package OOPs_Problems;

// Constructor Concepts

public class Student {

    private String name;
    private int age = 0;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void details() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}
