package armen.Concurrent;

public class PhaserCar implements Runnable {

    PhaserMain pm = new PhaserMain();
    private int carNumber;
    private int carSpeed;

    public PhaserCar(int carNumber, int carSpeed) {
        this.carNumber = carNumber;
        this.carSpeed = carSpeed;
    }

    public void run(){
        try {
            System.out.printf("Car №%d drove up to the starting straight.\n", carNumber);
            pm.getStart().arriveAndDeregister();
            pm.getStart().awaitAdvance(0);
            Thread.sleep(pm.getTrackLength() / carSpeed);
            System.out.printf("Car №%d finished!\n", carNumber);
        }catch (InterruptedException e){}
    }
}
