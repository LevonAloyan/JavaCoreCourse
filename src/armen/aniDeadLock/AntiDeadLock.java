package armen.aniDeadLock;

/**
 * Created by Amalia on 22.01.2019.
 */
public class AntiDeadLock {
    public void safeMethod(Object obj1, Object obj2) {
        Object first = obj1.hashCode() > obj2.hashCode() ? obj1 : obj2;
        Object second = obj1.hashCode() > obj2.hashCode() ? obj2 : obj1;
        synchronized (first) {
            longTimeMethod();
            synchronized (second) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final AntiDeadLock solution = new AntiDeadLock();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o1, o2);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o2, o1);
            }
        }.start();
    }
}
