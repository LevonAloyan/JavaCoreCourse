package armen.newThread;

/**
 * Created by Amalia on 23.12.2018.
 */
public class SynchProcess {
    int n;
    boolean setValue = false;

    public synchronized int get(){
        while (!setValue){
            try {
                wait();
            }catch (InterruptedException e){}
            System.out.println("received: " + n);
            setValue = false;
            notify();
        }
        return n;
    }

    public synchronized void put(int n){
        while (setValue){
            try {
                wait();
            }catch (InterruptedException e){}
            this.n = n;
            setValue = true;
            System.out.println("sent: " + n);
            notify();
        }
    }
}
