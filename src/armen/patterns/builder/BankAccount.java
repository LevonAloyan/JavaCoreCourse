package armen.patterns.builder;

/**
 * Created by Amalia on 11.01.2019.
 */
public class BankAccount {

    private int accountNumber;
    private String owner;
    private double balance;

    BankAccount(){}

    public class AccountBuilder{

        public AccountBuilder addAccountnumber(int accountNumber){
            BankAccount.this.accountNumber = accountNumber;
            return this;
        }

        public AccountBuilder addOwner(String owner){
            BankAccount.this.owner = owner;
            return this;
        }

        public AccountBuilder addBalance(double balace){
            BankAccount.this.balance = balace;
            return this;
        }

        public BankAccount build(){
            return BankAccount.this;
        }
    }

    public AccountBuilder buildAccount(){
        return new BankAccount().new AccountBuilder();
    }

    public String toString() {
        return "BankAccount{" + '\n' +
                "accountNumber = " + accountNumber + '\n' +
                "owner = " + owner + '\n' +
                "balance = " + balance + '}';
    }
}
