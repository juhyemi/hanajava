package company;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String owner, double interestRate) {
        super(owner);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}