package armen.patterns.builder;

import armen.syncThread.Synch;

/**
 * Created by Amalia on 11.01.2019.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount().getBuilder().setAccountNumber(135264).setOwner("vardan Arakelyan").setBalance(5454.25).build();
        System.out.print(bankAccount);
    }
}
