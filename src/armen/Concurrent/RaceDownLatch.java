package armen.Concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Amalia on 03.01.2019.
 */
public class RaceDownLatch {

    private static CountDownLatch START = new CountDownLatch(8);
    private static int trackLength = 500000;

    public CountDownLatch getStart(){
        return START;
    }
    public int getTrackLength(){
        return trackLength;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new CarDownLatch(i, (int)(Math.random() * 100 + 50))).start();
            Thread.sleep(1000);
        }

        while (START.getCount() > 3) { //Проверяем, собрались ли все автомобили
            Thread.sleep(100);              //у стартовой прямой. Если нет, ждем 100ms
        }
            Thread.sleep(1000);
            System.out.println("On the start!");
            START.countDown();//Команда дана, уменьшаем счетчик на 1
            Thread.sleep(1000);
            System.out.println("Attention!");
            START.countDown();//Команда дана, уменьшаем счетчик на 1
            Thread.sleep(1000);
            System.out.println("Go!");
            START.countDown();//Команда дана, уменьшаем счетчик на 1
            //счетчик становится равным нулю, и все ожидающие потоки
            //одновременно разблокируются
    }
}
