package armen.Concurrent;

/**
 * Created by Amalia on 04.01.2019.
 */
public class ExchangerTruck implements Runnable {

    ExchangerMain exm = new ExchangerMain();
    private int number;
    private String dep;
    private String dest;
    private String[] parcels;

    public ExchangerTruck(int number, String departure, String destination, String[] parcels) {
        this.number = number;
        this.dep = departure;
        this.dest = destination;
        this.parcels = parcels;
    }

    public void run(){
        try {
            System.out.printf("In truck №%d loaded: %s and %s. \n", number, parcels[0], parcels[1]);
            System.out.printf("Truck №%d move out from point %s to point %s.\n", number, dep, dest);
            Thread.sleep(1000 + (long)Math.random() * 5000);
            System.out.printf("Truck №%d had arrived to point Е.\n", number);
            parcels[1] = exm.getExchanger().exchange(parcels[1]);//При вызове exchange() поток блокируется и ждет
            //пока другой поток вызовет exchange(), после этого произойдет обмен посылками
            System.out.printf("They moved in truck №%d parcel for point %s.\n", number, dest);
            Thread.sleep(1000 + (long) Math.random() * 5000);
            System.out.printf("Truck №%d had arrived %s and delivered: %s and %s.\n", number, dest, parcels[0], parcels[1]);
        }catch (InterruptedException e){}
    }
}
