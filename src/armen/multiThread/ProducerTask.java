package armen.multiThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Amalia on 08.01.2019.
 */
public class ProducerTask implements Runnable {

    private TransferObject transferObject;
    protected volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);

    public ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                synchronized (transferObject) {
                    Thread.sleep(500);
                    transferObject.put(i.incrementAndGet());
                }
            }catch (InterruptedException e){}
        }
    }

    public void stop() {
        stopped = true;
    }
}
