// Anonymous inner class and Anonymous object

abstract class A {
    public abstract void show();
}

class B {
    public void show() {
        System.out.println("in B show");
    }
}

class C {

    // here we create a new inner class
    class D {
        public void show() {
            System.out.println("in D inner class");
        }
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // anonymous object
        new B().show();

        // the problem is every time it creates new object and cannot reuse

        // anonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("in anonymous inner class");
            }
        };

        obj.show();

        // advantage of anonymous inner class is cannot create a new class
        // but it use only once

        C obj2 = new C();
        C.D obj3 = obj2.new D();
        obj3.show(); 
    }
}
