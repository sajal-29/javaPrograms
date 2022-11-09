package arrays;
import java.util.*;
public class multidimensional_Arrays_question {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[3][2];
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println(maxNum(arr));
        }  

        static int maxNum(int[][]arr){
            int max =0;
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j]>max){
                    max = arr[i][j];
                  }
                }
        }
            return max;  
}
}
