package armen.syncThread;

/**
 * Created by Amalia on 16.12.2018.
 */
public class CallMy {
    OtherThread td = new OtherThread();
    public void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.print("]");
        td.newCall();
    }
}
