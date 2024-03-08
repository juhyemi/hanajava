package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        //int c = a/b; 타입이 맞지 않음
        long c = a/b;

        int i1=10;
        int i2=3;
        double i3= 1.0*i1/i2;
        System.out.print(i3);

        int result = i1++ + ++i2;
        System.out.printf("%d %d %d",result,i1,i2);

        int aa = 0;
        if(3>5){
            aa=6;
        }else{
            aa=9;
        }
        int bb=(3>5)?6:9;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //3수의 최대 값
        int num4 = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        System.out.print("max"+num4);
    }
}
