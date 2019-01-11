package armen.patterns.builder;

import armen.syncThread.Synch;

/**
 * Created by Amalia on 11.01.2019.
 */
public class Main {

    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount().buildAccount().addOwner(" Vardan Arakelyan").addAccountnumber(1658294).addBalance(5000.32).build();
        System.out.println(bankAccount);
    }
}
