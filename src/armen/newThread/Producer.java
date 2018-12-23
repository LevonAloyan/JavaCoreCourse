package armen.newThread;

/**
 * Created by Amalia on 23.12.2018.
 */
public class Producer implements Runnable{
    SynchProcess synch;

    public Producer(SynchProcess synch){
        this.synch = synch;
        new Thread(this, "Producer").start();
    }
    public void run(){
        int i = 0;
        while (true){
            synch.put(i++);
        }
    }
}
