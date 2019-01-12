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

        public AccountBuilder setAccountNumber(int accountNumber){
            BankAccount.this.accountNumber = accountNumber;
            return this;
        }
        public AccountBuilder setOwner(String owner){
            BankAccount.this.owner = owner;
            return this;
        }
        public AccountBuilder setBalance(double balance){
            BankAccount.this.balance = balance;
            return this;
        }
        public BankAccount build(){
            return BankAccount.this;
        }
    }
    public AccountBuilder getBuilder(){
        return new BankAccount().new AccountBuilder();
    }
    public String toString(){
        return "Information about owner" + "\n" +
                "account number - " + accountNumber + "\n" +
                "owners name - " + owner + "\n" +
                "balance on id- " + balance;
    }
}
