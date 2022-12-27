package stacks_and_queues;

public class Practice_queue {
    int front;
    int rear;
    int[] arr;
    int size;
    Practice_queue(int size){
        this.size = size;
        arr = new int[size];
        this.front = this.rear = -1;
    }

    void enqueue(int val){
        if(isFull()){
            System.out.println("Queue full");
            return;
        }
        else if(isEmpty()){
            rear=front=0;
        }
        else{
            rear ++;;
        }
        arr[rear] = val;
        
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return;
        }
        else{
            System.out.println(arr[front++]);
        }
    }

    boolean isEmpty() {
        return (front>rear || front== -1);
    }

    boolean isFull() {
        return rear==size-1;
    }
}
