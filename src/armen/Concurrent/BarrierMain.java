package armen.Concurrent;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by Amalia on 04.01.2019.
 */
public class BarrierMain {
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, new BarrierFerry());

    public CyclicBarrier getBARRIER(){
        return BARRIER;
    }

    public static void main(String[] args) throws InterruptedException{
        for(int i = 0; i < 9; i++){
            new Thread(new BarrierCar(i)).start();
            Thread.sleep(1000);
        }
    }
}
