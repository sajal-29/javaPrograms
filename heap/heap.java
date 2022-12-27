package heap;

public class heap {
    int[] arr = new int[100];
    int size;

    heap() {
        this.size = 0;
    }

    void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;
        while (index > 1) {
            int i = index / 2;
            if (arr[index] > arr[i]) {
                swap(index, i);
                index = i;
            } else {
                return;
            }
        }
    }

    int delete() {
        if (size == 0) {
            return -1;
        }
        int max = arr[size];
        arr[1] = max;
        size--;
        int i = 1;
        while (i > 0) {
            int leftchild = 2 * i;
            int rightchild = 2 * i + 1;

            if (arr[i] < arr[leftchild]) {
                swap(i, leftchild);
                i = leftchild;
            }

            else if (arr[i] < arr[rightchild]) {
                swap(i, rightchild);
                i = rightchild;
            }

            else {
                break;
            }
        }
        return max;
    }

    private void swap(int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }



    void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
