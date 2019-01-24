package armen.deadLock;

public class DeadLockTest {
    private final String name;

    public DeadLockTest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void bow(DeadLockTest bower) {
        System.out.format("%s: %s" + " has bowed to me!%n", this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(DeadLockTest bower) {
        System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
    }
}

