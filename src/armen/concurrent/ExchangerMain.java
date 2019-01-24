package armen.concurrent;

import java.util.concurrent.Exchanger;

/**
 * Created by Amalia on 04.01.2019.
 */
public class ExchangerMain {
    private static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public Exchanger<String> getExchanger(){
        return EXCHANGER;
    }

    public static void main(String[] args) throws InterruptedException{
        String[] s1 = new String[]{"Packege A -> D", "Packege A -> C"};
        String[] s2 = new String[]{"Packege B -> D", "Packege B -> C"};
        new Thread(new ExchangerTruck(1, "A", "D", s1)).start();
        Thread.sleep(1000);
        new Thread(new ExchangerTruck(2, "B", "C", s2)).start();
    }
}
