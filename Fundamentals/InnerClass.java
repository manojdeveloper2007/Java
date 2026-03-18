
// Innerclass mean ,a class inside another class

class Outer {

    protected String name;
    protected final float pi = 3.14f;

    public void show() {
        System.out.println("It is Outside Class");
    }

    // Inner Class
    class Inner {

        protected int age = 19;

        public void show(){
            System.out.println("It is Inner Class");
        }

    }
}

public  class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        System.out.println(obj.pi+" : "+obj.name);

        // How to acces and call inner method
        Outer.Inner obj2 = obj.new Inner();
        obj2.show();
        System.out.println(obj2.age);
    }
}
