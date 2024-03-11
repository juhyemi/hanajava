package bank;


public class Account {
    private String accNum;
    private String custName;
    private long balance;
    private double interest;
    public static int count=0;
    static{
        System.out.println("Start static Area ....");
        count = 1000000;
        System.out.println("End static Area ....");
    }
    public Account(){

    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = String.valueOf(count);
        this.custName = custName;
        if(balance<0){
            System.out.println("잔액은 0원 이상이 입력되어야 합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
        count++;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }
    public void deposit(long money){
        if(money <=0) return;//Exception ...
        this.balance+=money;
    }
    public void withdraw(long money){
        if(money <=0 || this.balance<money) return;
        this.balance-=money;
    }
    public double getCallInterest(){
        return (this.balance * interest)/100;
    }
    public double getCallInterest(int month){
        return (int)(this.getCallInterest());
        //return this();//불가능
        //return (int)((this.balance*interest)/100);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}


