package armen.syncThread;

/**
 * Created by Amalia on 22.12.2018.
 */
public class Tik implements Runnable {
    ClockHands otherClock;

    public Tik(ClockHands otherClock){
        this.otherClock = otherClock;
        new Thread(this).start();
    }
    public void run(){
        while (true){
            try {
                otherClock.clockTik();
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
