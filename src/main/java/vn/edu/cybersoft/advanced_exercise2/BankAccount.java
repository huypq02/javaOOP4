package vn.edu.cybersoft.advanced_exercise2;

public abstract class BankAccount {
    private String account_number, account_holder;
    double balance;

    public BankAccount(String account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void display_info() {
        System.out.println("Account Number: " + this.account_number + ", Account Holder: " + this.account_holder + ", Balance: " + this.balance);
    }
}
