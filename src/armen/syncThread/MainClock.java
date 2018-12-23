package armen.syncThread;

/**
 * Created by Amalia on 19.12.2018.
 */
public class MainClock extends Thread {

    public static void main(String[] args) throws InterruptedException{

        ClockHands clock = new ClockHands();
        MainClock clock1 = new MainClock();
        MainClock.interrupted();
            new Tik(clock);
            new Tak(clock);
        if(clock1.isInterrupted()){
            return;
        }
    }
}
