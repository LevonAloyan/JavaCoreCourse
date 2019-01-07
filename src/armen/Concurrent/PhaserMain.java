package armen.Concurrent;

import java.util.concurrent.Phaser;

public class PhaserMain {

    private static final Phaser START = new Phaser(8);
    private static final int trackLength = 500000;

    public Phaser getStart(){
        return START;
    }
    public int getTrackLength(){
        return trackLength;
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new PhaserCar(i, (int)(Math.random() * 100 + 50))).start();
            Thread.sleep(100);
        }

        while (START.getRegisteredParties() > 3) //Проверяем, собрались ли все автомобили
            Thread.sleep(100);                  //у стартовой прямой. Если нет, ждем 100ms

        Thread.sleep(1000);
        System.out.println("On the start!");
        START.arriveAndDeregister();
        Thread.sleep(1000);
        System.out.println("Attention!");
        START.arriveAndDeregister();
        Thread.sleep(1000);
        System.out.println("Go!");
        START.arriveAndDeregister();
    }
}
