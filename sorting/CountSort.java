package sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 4, 1, 6, 4, 3 };

        int n = arr.length;

        System.out.println(Arrays.toString(countSort(arr, n)));
    }

    static int[] countSort(int[] arr, int size) {
        int count = 0;

        int[] str = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == arr[j]) {
                    count++;
                }
            }
            str[i] = count;
            count = 0;
        }

        for (int i = 0; i < size; i++) {
            count += str[i];
            str[i] = count;
        }

        int[] output = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            output[--str[arr[i]]] = arr[i];
        }
        return output;
    }

}
