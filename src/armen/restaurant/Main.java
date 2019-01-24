package armen.restaurant;

/**
 * Created by Amalia on 30.12.2018.
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dishes dish = new Dishes(2);
        new Cook(dish);
        new Waiter(dish);
        new Customer(dish);
    }
}
