package vn.edu.cybersoft.advanced_exercise2;

public class SavingsAccount extends BankAccount{
    private double interest_rate;

    public SavingsAccount(String account_number, String account_holder, double balance, double interest_rate) {
        super(account_number, account_holder, balance);
        this.interest_rate = interest_rate;
    }

    public void add_interest() {
        this.balance += this.balance * this.interest_rate;
    }
}
