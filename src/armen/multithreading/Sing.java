package armen.multithreading;

public class Sing extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("sing");
        Thread.currentThread().setPriority(MAX_PRIORITY);

        System.out.println(Thread.currentThread()+"Run method Sing thread");
    }

}
