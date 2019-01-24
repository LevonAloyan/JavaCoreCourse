package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Cook implements Runnable {

    Dishes dish;

    Cook (Dishes dish){
        this.dish = dish;
        new Thread(this,"Cook").start();
    }

    public void run() {
        while(true) {
            dish.cooking();
        }
    }
}
