package armen.syncThread;

/**
 * Created by Amalia on 19.12.2018.
 */
public class MainClock extends Thread {

    public static void main(String[] args) throws InterruptedException{

        MainClock mc = new MainClock();
        ClockHands clock = new ClockHands();
        synchronized (clock) {
            new Tik(clock);
            new Tak(clock);
        }
    }
}
