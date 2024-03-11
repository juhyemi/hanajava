package car2;

public class App {
    public static void main(String[] args) {
        //기능위주 클래스 생성했기 때문에 객체를 생성할 필요가 없다.
        //클래스가 가지는 함수값 static 이용한 예제
        double result = Cal2.sum(100,200);
        System.out.println(result);
        double result2 = Cal2.getCircleArea(5);
        System.out.println(result2);
    }
}
