package practice;

public class maxHeap {
    public static void main(String[] args) {
        int[] arr = {-1,23,68,88,89,90};
        buildMaxHeap(arr, arr.length);
    }
    static void heapify(int[] arr, int n, int i ){
        int largest = i;
        int leftnode = 2*i;
        int rightnode = 2*i + 1;
        if(leftnode < n && arr[leftnode] > arr[largest]){
            largest = leftnode;
        }
        if(rightnode < n && arr[rightnode] > arr[largest]){
            largest = rightnode;
            
        }
        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

   static void buildMaxHeap(int[] arr, int n){
        for (int i = n/2; i > 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index]= temp;
    }
}
