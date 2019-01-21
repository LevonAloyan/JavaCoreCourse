package armen.threadFactory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Amalia on 20.01.2019.
 */
public class NewThreadFactory implements ThreadFactory {

    private static AtomicInteger factoryCount = new AtomicInteger(0);
    private AtomicInteger factoryNum = new AtomicInteger(0);
    private AtomicInteger threadNum = new AtomicInteger(0);

    public NewThreadFactory() {
        factoryNum.set(factoryCount.incrementAndGet());
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName(thread.getThreadGroup().getName() + " - pool " + factoryNum + " - thread " + threadNum.incrementAndGet());
        return thread;
    }
}
