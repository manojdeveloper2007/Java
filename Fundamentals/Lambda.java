// A functional interface must be hold a abstract method
// lambda expression must work in functional interface
@FunctionalInterface
interface A {
    //default it is a public abstract method
    void add(int n1,int n2);
}

@FunctionalInterface
interface B {
    // using return type
    int mul(int n1 , int n2);
}

public class Lambda {
    public static void main(String[] args) {
        //one way to creat anonymous class to call add
        A obj1 = new A() {
            public void add(int n1,int n2) {
                System.out.println("Addition : "+(n1+n2));
            }
        };
        obj1.add(12, 8);

        // using another way to using lambda expression
        A obj2 = (n1 , n2) -> System.out.println("Addition : "+(n1+n2));
        obj2.add(12,5);

        // first method using anonymous class
        B obj3 = new B() {
            public int mul(int n1 , int n2 ){
                return n1 * n2;
            }
        };
        int result1 = obj3.mul(5, 3);
        System.out.println("Result : "+result1);

        // using lambda expression on return type abstract method
        B obj4 = (n1,n2) -> n1*n2;
        int result2 = obj4.mul(6, result1);
        System.out.println("Result : "+result2);

    }
}
