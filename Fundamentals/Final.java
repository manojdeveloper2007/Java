// final variable => it is a constant,cannot change
// final method => cannot be overriden
// final class => cannot be inherit

class A{

    protected final double pi = 3.14;

    public final void show(){
        System.out.println("It is final method");
    }

}

class B extends A{
    
}


public class Final {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
