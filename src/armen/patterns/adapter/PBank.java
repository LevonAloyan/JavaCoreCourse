package armen.patterns.adapter;

/**
 * Created by Amalia on 19.01.2019.
 */
public class PBank {
    private int balance;
    public PBank() { balance = 100; }
    public void getBalance() {
        System.out.println("PBank balance = " + balance);
    }
}
