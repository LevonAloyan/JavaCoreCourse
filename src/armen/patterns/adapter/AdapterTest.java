package armen.patterns.adapter;

/**
 * Created by Amalia on 19.01.2019.
 */
public class AdapterTest {
    public static void main(String[] args) {
        PBank pbank = new PBank();
        pbank.getBalance();
        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();
    }
}
