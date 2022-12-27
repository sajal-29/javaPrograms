package stacks_and_queues;

public class Practice_Stack {
    int size;
    int[] arr;
    int top;

    Practice_Stack(int size) {
        this.size = size;
        arr = new int[size];
        this.top = -1;

    }

    void push(int val) {
        if (isEmpty()) {
            top = 0;
            arr[top] = val;

        } else if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top = (top + 1) % size;
            arr[top] = val;
        }

    }

    boolean isFull() {
        return top == size - 1;
    }

    // void middleRemoval(){
    //     int count = top;
    //     System.out.println(arr[count]);

    // }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top]);
            top = (top - 1) % size;
        }

    }

    boolean isEmpty() {
        return top == -1;
    }

    int seek() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[top];
        }
    }

}
