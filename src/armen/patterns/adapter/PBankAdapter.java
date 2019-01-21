package armen.patterns.adapter;

/**
 * Created by Amalia on 19.01.2019.
 */
public class PBankAdapter extends PBank{
    private ABank abank;
    public PBankAdapter(ABank abank) {
        this.abank = abank;
    }
    public void getBalance() {
        abank.getBalance();
    }
}
