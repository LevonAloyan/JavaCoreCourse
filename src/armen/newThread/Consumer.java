package armen.newThread;

/**
 * Created by Amalia on 23.12.2018.
 */
public class Consumer implements Runnable {
    SynchProcess synch;

    public Consumer(SynchProcess synch){
        this.synch = synch;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while (true){
            synch.get();
        }
    }
}
