package armen.deadLock;

/**
 * Created by Amalia on 21.01.2019.
 */
public class DeadLock {
    public static void main(String[] args) {
        final DeadLockTest david = new DeadLockTest("David");
        final DeadLockTest vardam = new DeadLockTest("Vardan");
        new Thread(new Runnable() {
            public void run() {
                david.bow(vardam);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                vardam.bow(david);
            }
        }).start();
    }
}
