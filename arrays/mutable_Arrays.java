package arrays;

import java.util.Arrays;
import java.util.Scanner;

class mutable_Arrays{               // SHOWS MUTABILITY OF ARRAYS 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(Arrays.toString(arr)); 
        change(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){  // It is static because it should be called in a static method 
                                    // which is public STATIC main.
        arr[1]=3;
    }
}