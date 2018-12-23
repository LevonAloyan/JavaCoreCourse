package armen.newThread;

/**
 * Created by Amalia on 23.12.2018.
 */
public class SynchMain {

    public static void main(String[] srgs){
        SynchProcess synch = new SynchProcess();
        new Producer(synch);
        new Consumer(synch);
    }
}
