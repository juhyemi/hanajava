package company;

public class InvestmentAccount extends Account {
    private String investmentType;

    public InvestmentAccount(String owner, String investmentType) {
        super(owner);
        this.investmentType = investmentType;
    }

    public void invest(double amount) {
        if (amount > 0) {
            deposit(amount);
            System.out.println(amount + " invested successfully in " + investmentType + ".");
            date();
        } else {
            System.out.println("Invalid amount for investment.");
        }
    }

    public void divest(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            withdraw(amount);
            System.out.println(amount + " divested successfully from " + investmentType + ".");
            date();
        } else {
            System.out.println("Invalid amount for divestment.");
        }
    }
}