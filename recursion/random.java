package recursion;

import java.util.Arrays;

public class random {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 2, 4, 1, 2, 4, 5, 4 };
        int size = arr.length;
        int min = Arrays.stream(arr).min().getAsInt();
        int[] str = new int[size];
        for (int i = 0; i < size; i++) {
            str[arr[i] - min]++;
        }
        System.out.println(Arrays.toString(str));
    }
}
