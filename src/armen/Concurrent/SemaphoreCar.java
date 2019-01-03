package armen.Concurrent;

/**
 * Created by Amalia on 03.01.2019.
 */
public class SemaphoreCar implements Runnable {

    private int carNumber;
    SemaphoreTest st = new SemaphoreTest();

    SemaphoreCar(int carNumber){
        this.carNumber = carNumber;
    }

    public void run(){
        System.out.printf("Car №%d go to the parking.\n", carNumber);
        try{
            st.getSemaphore().acquire();
            int parkingNumber = -1;
            synchronized (st.getParkingPlace()) {
                for (int i = 0; i < 4; i++) {
                    if (!st.getParkingPlace()[i]) {
                        st.getParkingPlace()[i] = true;
                        parkingNumber = i;
                        System.out.printf("Car №%d parking in a place %d.\n", carNumber, i + 1);
                        break;
                    }
                }
            }
            Thread.sleep(4000);
            synchronized (st.getParkingPlace()){
                st.getParkingPlace()[parkingNumber] = false;
            }
            st.getSemaphore().release();
            System.out.printf("Car №%d left the parking.\n", carNumber);
        }catch (InterruptedException e){}
    }
}
