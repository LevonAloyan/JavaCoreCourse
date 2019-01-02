package armen.Concurrent;

/**
 * Created by Amalia on 02.01.2019.
 */
public class Car implements Runnable {

        private int carNumber;
        SemaphoreTest st = new SemaphoreTest();

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.printf("Car №%d go to the parking.\n", carNumber);
            try {
               st.getSemaphore().acquire();
                int parkingNumber = -1;
                synchronized (st.getParkingPlaces()){
                    for (int i = 0; i < 5; i++) {
                        if (!st.getParkingPlaces()[i]) {      //Если место свободно
                            st.getParkingPlaces()[i] = true;  //занимаем его
                            parkingNumber = i;         //Наличие свободного места, гарантирует семафор
                            System.out.printf("Car №%d parking in place %d.\n", carNumber, i);
                            break;
                        }
                    }
                }
                Thread.sleep(4000);       //Уходим за покупками, к примеру

                synchronized (st.getParkingPlaces()) {
                    st.getParkingPlaces()[parkingNumber] = false;//Освобождаем место
                }
                st.getSemaphore().release();
                System.out.printf("Car №%d left the parking.\n", carNumber);
            } catch (InterruptedException e) {}
        }
}
