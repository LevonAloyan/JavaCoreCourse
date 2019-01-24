package armen.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Created by Amalia on 02.01.2019.
 */
public class SemaphoreTest {

        private static boolean[] parkinPlace = new boolean[4];
        private static Semaphore semaphore = new Semaphore(4, true);

        public boolean[] getParkingPlace(){
            return parkinPlace;
        }
        public Semaphore getSemaphore(){
            return semaphore;
        }

        public static void main(String[] args) throws InterruptedException {
            for (int i = 1; i <= 7; i++) {
                new Thread(new SemaphoreCar(i)).start();
                Thread.sleep(1000);
            }
        }
    }
