package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Customer implements Runnable {

    Dishes d;

    Customer (Dishes d){
        this.d = d;
        new Thread(this, "Customer").start();
    }

    public void run() {
        while(true) {
            d.eating();
        }
    }
}
