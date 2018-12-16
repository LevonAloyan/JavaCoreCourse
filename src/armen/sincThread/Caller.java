package armen.sincThread;

/**
 * Created by Amalia on 16.12.2018.
 */
public class Caller implements Runnable {
    String msg;
    CallMy targed;
    Thread t;

    public Caller(CallMy targ, String msg){
        this.msg = msg;
        targed = targ;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        targed.call(msg);
    }
}
