package practice;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {2,7,32,67,324,56};
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length -i -1; 
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,last,maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int i, int max) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }
}
