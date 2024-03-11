package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(0,"100001", "james1",200000L);
        Employee emp2 = new Employee(0,"100002", "james2",200000L);
        Employee emp3 = new Employee(0,"100003", "james3",200000L);
        System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
