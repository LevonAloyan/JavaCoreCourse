package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Cook implements Runnable {

    Dishes d;

    Cook (Dishes d){
        this.d = d;
        new Thread(this,"Cook").start();
    }

    public void run() {
        while(true) {
            d.cooking();
        }
    }
}
