package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_Arrays {
  public static void main(String[] args) {
    // int[][] arr = {
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    // };
    //Input
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[2][3];
    for(int row = 0; row < arr.length; row++){
      // For each column in every row
      for (int column = 0; column < arr[row].length; column++) {
         arr[row][column] = sc.nextInt();
      }
    }
    for(int row = 0; row < arr.length; row++){
      for (int column = 0; column < arr[row].length; column++) {
        System.out.print(arr[row][column] + " ");
      }
    System.out.println();
    }  
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i])); // Every element of arr[i] acts as an array itself 
      
    }
    for(int[] x: arr){        // ENHANCED FOR LOOP 
      System.out.println(Arrays.toString(x));
    }

 }
}
