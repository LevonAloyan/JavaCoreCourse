package armen.syncThread;

/**
 * Created by Amalia on 20.12.2018.
 */
public class ClockHands {

    boolean clockSet = false;
    String s = "TIK";
    String z = "TAK";

    public synchronized void clockTik() throws InterruptedException {
        while (!clockSet) {
            wait();
        }
        clockSet = false;
        notify();
        System.out.println(s);
    }

    public synchronized void clockTak() throws InterruptedException {
        while (clockSet) {
            wait();
        }
        clockSet = true;
        notify();
        System.out.println(z);
    }
}
