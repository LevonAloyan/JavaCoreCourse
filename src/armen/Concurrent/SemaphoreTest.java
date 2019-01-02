package armen.Concurrent;

import java.util.concurrent.Semaphore;

/**
 * Created by Amalia on 02.01.2019.
 */
public class SemaphoreTest {

        private static final boolean[] PARKING_PLACES = new boolean[5];
        private static final Semaphore SEMAPHORE = new Semaphore(5, true);

        public boolean[] getParkingPlaces(){
            return PARKING_PLACES;
        }
        public Semaphore getSemaphore(){
            return SEMAPHORE;
        }

        public static void main(String[] args) throws InterruptedException {
            for (int i = 1; i <= 7; i++) {
                new Thread(new Car(i)).start();
                Thread.sleep(1000);
            }
        }
    }
