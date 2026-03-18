
class A {

    // Default constructor,there is no return type
    public A(){
        super();
        System.out.println("In A constructor");
    }

    // Parametrized constructor
    public A(int num){
        super();
        System.out.println("In Int A constructor");
    }
}

// super() and this()
class B extends A {

    public B(){
        super(7);
        System.out.println("In B constructor");
    }

    public B(int num){
        super();
        System.out.println("In Int B constructor");
    }
}

class C extends B {
    public C(){
        //this(7);
        System.out.println("In C constructor");
    }

    public C(int n){
        this();
        System.out.println("In int C constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {

        // when create object,constructor automatically executed
        // A obj = new A(7);

        // In every constructor ,super() is there,but hiding,it calls super class default constructor
        B obj = new B(10);
        C obj1 = new C(7);
    }
}
