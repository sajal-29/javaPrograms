package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,-3,2,-1};
        insertionsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
static void insertionsort(int arr[], int n){

    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j > 0; j--) {
            if(arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            else{
                break;
            }
        }
    }
}
} 
