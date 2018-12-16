package armen.sincThread;

/**
 * Created by Amalia on 16.12.2018.
 */
public class CallMy {
    public void call(String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
