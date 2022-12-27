package heap;

public class heapify {
    static void heapifyFunction(int[] arr, int size, int i) {
        int largest = i;
        int leftnode = 2 * i;
        int rightnode = 2 * i + 1;

        if (leftnode < size && arr[largest] < arr[leftnode]) {
            largest = leftnode;
        }
        if (rightnode < size && arr[largest] < arr[rightnode]) {
            largest = rightnode;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapifyFunction(arr, arr.length, largest);
        }
    }

    private static void swap(int[] arr, int i, int largest) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
    }

    public static void main(String[] args) {
        int[] h = { -1, 22, 45, 245, 2 };
        int n = h.length;
        for (int i = n / 2; i > 0; i--) {
            heapifyFunction(h, n, i);
        }
        for (int i = 1; i < n ; i++) {
            System.out.print(h[i] + " ");
        }
    }
}
