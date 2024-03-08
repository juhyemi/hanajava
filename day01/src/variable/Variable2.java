package variable;

public class Variable2 {
    public static void main(String[] args) {
        //정수
        int a = 10;
        byte a1 = 10; //127까지 가능
        byte a2 = 10;
//        byte a3 = a1+a2; => 연산결과가 int라서 에러
        byte a3 = (byte)(a1+a2);

        long a5=2150000000000L;
        long a6=1150000000 + 1150000000; //숫자가 넘어가면 -처리된다.

        char ch = '가';//character
        char ch2 = '\u0042'; //unicode
        char ch3 = 0xac00; //unicode 44032

        //실수
        double d = 10.0;
        float f = 10.0F;

        float f2 = (float)(10.1+10);

        //Boolean
        boolean b = true;

        //정수 int

    }
}
