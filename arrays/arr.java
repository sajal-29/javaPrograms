package arrays;

import java.util.*;

public class arr {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Taking input
    int[] arr = new int[4];
    for(int i =0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    // enhanced for loop 
    for(int x:arr){
        System.out.println(x);
     }

     // Using toString method to : Converts Array to String 
    System.out.println(Arrays.toString(arr));

    // Using for loop : Normal method
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
}    
}
