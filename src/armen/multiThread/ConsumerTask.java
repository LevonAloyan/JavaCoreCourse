package armen.multiThread;

/**
 * Created by Amalia on 08.01.2019.
 */
public class ConsumerTask implements Runnable {

    private TransferObject transferObject;
    protected volatile boolean stopped;

    public ConsumerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        while (!stopped) {
            try {
                synchronized (transferObject){
                    Thread.sleep(500);
                    transferObject.get();}
            }catch (InterruptedException e){}
        }
    }

    public void stop() {
        stopped = true;
    }
}
