package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        do{
           
       System.out.println("\n--MENU--\n");
       System.out.println("1.CREATE\n2.DISPLAY\n3.INSERT\n4.DELETE\n5.SEARCH\n6.Exit\n");
       a = sc.nextInt();
       if(a==6){
        switch(a){
            case 1: 
            System.out.println("Enter 5 elements");
               for (int i = 0; i < arr.length; i++) {
                    arr[i]=sc.nextInt();
               }
               break;
               
               case 2:
               for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
           }
             break;
             
           case 3:
           System.out.println("Insert your element");
           int x = sc.nextInt();
                    System.out.println(Arrays.toString(add(arr.length,arr,x)));
                
            break;

            case 4: arr =null;
            System.out.println(Arrays.toString(arr));
           break;

           case 5:
           System.out.println("Enter the element to be searched");
           int target = sc.nextInt();
           System.out.println("This element is at index: "+ BinarySearch(arr, target));
           break;

           case 6:
           break;

        }
       
    } 
}while(true);
   
    
    
}
public static int[] add(int n, int arr[], int x)
   {
       int i;
       int newarr[] = new int[n + 1];
   
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }
   static int BinarySearch(int[] arr , int target) {
    int start = 0;
    
    int end = arr.length-1;
    
    
    while(start<=end){
        int mid = start + (end - start)/2; //

        if(arr[mid]>target){

            end = mid-1;
        }
        else if (arr[mid]<target) {

            start = mid+ 1;
        }
        else{

            return mid;
        }
    }
    return -1;
}    
}
