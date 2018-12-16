package armen.syncThread;

/**
 * Created by Amalia on 16.12.2018.
 */
public class Caller implements Runnable {
    String msg;
    CallMy targed;
    Thread t;

    public Caller(CallMy targ, String msg){
        this.msg = msg;
        this.targed = targ;
        this.t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (targed) {
            targed.call(msg);
        }
    }
}
