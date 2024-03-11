package app;

import company.CheckingAccount;
import company.InvestmentAccount;
import company.SavingsAccount;

public class App {
    public static void main(String[] args) {
        // SavingsAccount 테스트
        SavingsAccount savingsAccount = new SavingsAccount("John", 0.5);
        savingsAccount.deposit(1000);
        System.out.println("현재잔액: " + savingsAccount.getBalance());
        double interest = savingsAccount.calculateInterest();
        System.out.println("이자: " + interest);

        // CheckingAccount 테스트
        CheckingAccount checkingAccount = new CheckingAccount("Alice", 500);
        checkingAccount.deposit(800);
        System.out.println("체크계좌 잔액: " + checkingAccount.getBalance());
        checkingAccount.withdraw(700);
        System.out.println("채크계좌 잔액: " + checkingAccount.getBalance());

        // InvestmentAccount 테스트
        InvestmentAccount investmentAccount = new InvestmentAccount("Bob", "Stocks");
        investmentAccount.deposit(2000);
        System.out.println("투자계좌 잔액: " + investmentAccount.getBalance());
        investmentAccount.invest(1500);
        System.out.println("투자후: " + investmentAccount.getBalance());
        investmentAccount.divest(700);
        System.out.println("투자회수후: " + investmentAccount.getBalance());
    }
}
