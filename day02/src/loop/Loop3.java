package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System, Connection 이런거 조심해야함 사용하고 꼭 끊어라 파이프 박는거랑 똑같음
        out:while(true){
            System.out.println("Input Command ..(q,c,r,u,d)");
            String cmd = sc.next();
            if(cmd.equals("q")){
                System.out.println("Bye");
                sc.close();
                break;
            }
            switch(cmd){
                case "c" : System.out.println("Create");break;
                case "r" : System.out.println("Read");
                    String id = sc.next();
                    System.out.println("Read ID Info ...");
                    break;
//                    sc.close();
//                    break out;
                case "u" : System.out.println("Update");break;
                case "d" : System.out.println("Delete");break;
                default: System.out.println("Try Again");
            }
        }
        System.out.println("End ....");
    }
}
