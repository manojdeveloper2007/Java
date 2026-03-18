// MultiThreading
// Multiple tasks run parallely

class A extends Thread {

    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("A Thread : "+(i+1));
        }
    }
}

class B extends Thread {

    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("B Thread : "+(i+1));
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();

        thread1.start();
        thread2.start();
    }
}