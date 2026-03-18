// Annotation => metadata(to inform our compiler on compile time)

// Myown annotation

@interface Myown {
    String name() default "Manoj";
    int age() default 0;
}

class A {

    public void showData() {
        System.out.println("to show data in class A");
    }
}

class B extends A {

    // it shows warning ,if method overriding is not present in child class
    @Override
    public void showData() {
        System.out.println("to show data in class B");
    }
}

// it says this class is old,so we cannot create objcet for this class
@Deprecated
class C {

    // unused variables using annotation
    @SuppressWarnings("unused")
    private int age;
    String name;

    public C(String name,int age) {
        this.name = name;
        this.age = age;
    }
}


abstract class D {
    // we cannot create object for abstract class
    public abstract void show();
}

class E {
    @Myown(name = "dhoni" , age = 18)
    public void show() {
        System.out.println("This is showww");
    }

}

public class Annotation {
    public static void main(String[] args) {
        A obj = new B();
        obj.showData();

        // i try to create object for class C
        @SuppressWarnings({"deprecation","unused"})
        C obj2 = new C("Manoj",18);
        // it says warning

        // we create anonymous class for abstract class
        D obj3 = new D() {
            public void show() {
                System.out.println("this is a anonymous class for abstract D class");
            }
        };
        obj3.show();
    
        E obj4 = new E();
        obj4.show();
    }
}
