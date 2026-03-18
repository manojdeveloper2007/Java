class Block {
    String name;
    static int rollno;

    // It is static block = it executes before main()
    static {
        rollno = 7;
        System.out.println("Static block executed");
    }

    public void display2(){
        System.out.println(rollno);
    }

    // static method
    public static void display(){
        System.out.println(rollno);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Block obj1 = new Block();
        obj1.display2();

        // static methods can call without creating a new object.it can access via using class name
        Block.display();  
    }
}
