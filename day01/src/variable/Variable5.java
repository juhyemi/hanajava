package variable;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        //역순으로 char를 대문자로 출력하시오
        String answer="";
        for(int i=str.length()-1; i>=0; i--){
            answer += String.valueOf(str.charAt(i)).toUpperCase();
        }
        System.out.println(answer);

    }
}
