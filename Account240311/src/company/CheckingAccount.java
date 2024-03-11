package company;

import java.util.Date;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String owner, double overdraftLimit) {
        super(owner);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            date();
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

}