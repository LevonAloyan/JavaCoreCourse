package armen.Concurrent;

/**
 * Created by Amalia on 04.01.2019.
 */
public class BarrierFerry implements Runnable {

    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Ferry ferried cars!");
        }catch (InterruptedException e){}
    }
}
