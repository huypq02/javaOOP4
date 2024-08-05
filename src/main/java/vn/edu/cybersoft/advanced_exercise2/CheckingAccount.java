package vn.edu.cybersoft.advanced_exercise2;

public class CheckingAccount extends BankAccount{
    private double overdraft_limit;

    public CheckingAccount(String account_number, String account_holder, double balance, double overdraft_limit) {
        super(account_number, account_holder, balance);
        this.overdraft_limit = overdraft_limit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
