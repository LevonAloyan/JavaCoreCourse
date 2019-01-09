package armen.multithreading.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        b.start();
        b.join();
        a.start();
    }
}
