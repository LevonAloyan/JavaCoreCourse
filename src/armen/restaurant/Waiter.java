package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Waiter implements Runnable {

    Dishes d;

    Waiter(Dishes d){
        this.d = d;
        new Thread(this, "Waiter").start();
    }

    public void run() {
        while(true) {
            d.bring();
        }
    }
}
