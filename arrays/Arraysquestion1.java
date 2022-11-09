package arrays;

import java.util.Scanner;

// To find the sum of array without including digits that are repeated 
public class Arraysquestion1 {
   public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[6];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for(int i =0;i<arr.length;i++){
        // sum += arr[i];
       for(int j = i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                sum += arr[i];
            }
        }
    } 
    System.out.println(sum);
   }   
 }
