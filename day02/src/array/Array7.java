package array;
import java.util.*;
public class Array7 {
    public static void main(String[] args) {
        //5행 5열의 배열에
        //Random 하게 중복되지 않은 1~100까지의 수를 발생 시킨다.
        //각 열에 최대값의 핪과 최소값의 합을 출력하시오
        Random r = new Random();
        int[][] arr = new int[5][5];
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean[] check = new boolean[100];
            for(int j=0; j<arr[0].length; j++){
                int k = r.nextInt(100)+1;
                if(!check[k-1]){
                    check[k-1]=true;
                    arr[i][j]=k;
                    max = Math.max(k,max);
                    min = Math.min(k,min);
                }else {
                    j--;
                }
            }
            System.out.println(max+min);
        }
    }
}
