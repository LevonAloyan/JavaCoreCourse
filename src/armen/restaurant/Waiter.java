package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Waiter implements Runnable {

    Dishes dish;

    Waiter(Dishes dish){
        this.dish = dish;
        new Thread(this, "Waiter").start();
    }

    public void run() {
        while(true) {
            dish.bring();
        }
    }
}
