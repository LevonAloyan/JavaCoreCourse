package armen.threadFactory;

/**
 * Created by Amalia on 20.01.2019.
 */
public class ThreadFactoryTest {

    public static void main(String[] args) {
        class EmulateThreadFactoryTask implements Runnable {

            public void run() {
                emulateThreadFactory();
            }
        }
        ThreadGroup group1 = new ThreadGroup("GroupA");
        Thread thread1 = new Thread(group1, new EmulateThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("GroupB");
        Thread thread2 = new Thread(group2, new EmulateThreadFactoryTask());

        thread1.start();
        thread2.start();
    }
    private static void emulateThreadFactory() {
        NewThreadFactory factory = new NewThreadFactory();
        Runnable r = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }
}
