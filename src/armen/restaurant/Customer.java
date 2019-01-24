package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Customer implements Runnable {

    Dishes dish;

    Customer (Dishes dish){
        this.dish = dish;
        new Thread(this, "Customer").start();
    }

    public void run() {
        while(true) {
            dish.eating();
        }
    }
}
