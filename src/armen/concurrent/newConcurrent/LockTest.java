package armen.concurrent.newConcurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Amalia on 22.01.2019.
 */
public class LockTest {

    private final Lock lock = new ReentrantLock();

    public void someMethod() {
        if (lock.tryLock()) {
            try {
                ifLockIsFree();
            } finally {
                lock.unlock();
            }
        } else {
            ifLockIsBusy();
        }
    }

    @SuppressWarnings("EmptyMethod")
    private void ifLockIsFree() {
    }

    @SuppressWarnings("EmptyMethod")
    private void ifLockIsBusy() {
    }
}
