package recursion;

public class BS_recursion {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 8, 34, 37, 45 };
        System.out.println(Binarysearch(arr, 34, 0, arr.length - 1));
    }

    static int Binarysearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return Binarysearch(arr, target, start, mid - 1);
        }
        return Binarysearch(arr, target, mid + 1, end);
    }
}
