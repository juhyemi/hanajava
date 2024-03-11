package array;

import java.util.*;

public class Array4 {
    public static void main(String[] args) {
//        Random r = new Random();
//        int num = r.nextInt(10)+1; // 1~10까지
//        System.out.println(num);

        // int형 배열 사이즈 10개
        // 배열에 1~10까지의 숫자를 Random 하게 넣고
        // 합과 평균을 구하시오

        Random r = new Random();
        int[] arr = new int[10];
        boolean[] check = new boolean[10];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int k= r.nextInt(10)+1;
            if(!check[k-1]){
                check[k-1]=true;
                arr[i]=k;
                sum+=k;
            }else{
                i--;
            }
        }
        int avg = sum/arr.length;
        System.out.println(sum+" "+avg);
    }
}
