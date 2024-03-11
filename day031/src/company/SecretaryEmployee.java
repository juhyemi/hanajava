package company;

public class SecretaryEmployee extends Employee{
    private String boss;

    public SecretaryEmployee(){
    }
    public SecretaryEmployee(String id, String name, String dept, long salary, String boss) {
        super(id, name, dept, salary); //상위 클래스에 있는 construct 활용해서 메모리에 집어 넣겠다.
        this.boss = boss;
    }
    public String getBoss() {
        return boss;
    }
    @Override
    public String toString() {
        return super.toString() + this.boss;
    }
}
