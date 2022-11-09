package sorting;

import java.util.Arrays;

class selectionSort{
    public static void main(String[] args) {
        int[] arr = {3,4,2,-13,5,0};
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, last, 0);
            swap(arr, maxIndex, last);    
        }
        System.out.println(Arrays.toString(arr));
    }
    static int getMaxIndex(int[] arr , int last, int first){
        int max = first;
        for (int i = first; i <= last; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}