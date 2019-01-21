package armen.patterns.adapter;

/**
 * Created by Amalia on 19.01.2019.
 */
public class ABank {
    private int balance;
    public ABank() { balance = 200; }
    public void getBalance() {
        System.out.println("ABank balance = " + balance);
    }
}
