package company;

import java.util.Date;

public class Account {
    private String owner;
    protected double balance;
    protected Date date;

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
        this.date = new Date();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
            date = new Date();
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            date = new Date();
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public Date date(){
        return date;
    }
}