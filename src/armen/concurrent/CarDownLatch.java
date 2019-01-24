package armen.concurrent;

/**
 * Created by Amalia on 03.01.2019.
 */
public class CarDownLatch implements Runnable{
    private int carNumber;
    private int carSpeed;
    RaceDownLatch rdl = new RaceDownLatch();

    public CarDownLatch(int carNumber, int carSpeed) {
        this.carNumber = carNumber;
        this.carSpeed = carSpeed;
    }

    public void run() {
        try {
            System.out.printf("Car №%d drove to the starting straight.\n", carNumber);
            rdl.getStart().countDown();
            rdl.getStart().await();
            Thread.sleep(rdl.getTrackLength() / carSpeed);//ждем пока проедет трассу
            System.out.printf("Car №%d finished!\n", carNumber);
        } catch (InterruptedException e) {}
    }
}

