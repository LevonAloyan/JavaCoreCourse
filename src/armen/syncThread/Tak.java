package armen.syncThread;

/**
 * Created by Amalia on 22.12.2018.
 */
public class Tak implements Runnable {
    ClockHands otherClock;

    public Tak(ClockHands otherClock){
        this.otherClock = otherClock;
        new Thread(this).start();
    }
    public void run(){
        while (true){
            try {
                otherClock.clockTak();
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
