package car1.app;

import car1.Cal;

public class App {
    public static void main(String[] args) {
        Cal cal = new Cal(10,20);
        System.out.println(cal.sum());
        System.out.println(cal.div());
    }
}
