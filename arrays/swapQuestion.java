package arrays;

import java.util.Arrays;

public class swapQuestion {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,7,86};
        System.out.println(Arrays.toString(arr));

        swap(arr,1,5);
    }
    static void swap(int[] arr, int index1,int index2) {
        int temp=0;
        temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
