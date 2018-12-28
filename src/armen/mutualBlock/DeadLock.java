package armen.mutualBlock;

/**
 * Created by Amalia on 28.12.2018.
 */
public class DeadLock {
    First first = new First();
    Second second = new Second();

    public DeadLock(){
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread("Rival thread");
        t.start();
        first.foo(second);
        System.out.println("Back, to the Main thread.");
    }
    public void run(){
        second.bar(first);
        System.out.println("Back, to the other thread.");
    }
    public static void main(String[] args){
        new DeadLock();
    }
}
