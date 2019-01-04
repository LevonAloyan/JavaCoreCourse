package armen.Concurrent;

/**
 * Created by Amalia on 04.01.2019.
 */
public class BarrierCar implements Runnable{

    private int carNumber;
    BarrierMain bm = new BarrierMain();
    BarrierCar(int carNumber){
        this.carNumber = carNumber;
    }

    public void run(){
        try {
            System.out.printf("Car №%d drove up to the ferry.\n", carNumber + 1);
            bm.getBARRIER().await();
            System.out.printf("Car №%d keeps moving.\n", carNumber + 1);
        }catch (Exception e){}
    }
}
