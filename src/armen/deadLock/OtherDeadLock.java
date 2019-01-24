package armen.deadLock;

/**
 * Created by Amalia on 21.01.2019.
 */
public class OtherDeadLock {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock)
        {
            synchronized (this)
            {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }
}
