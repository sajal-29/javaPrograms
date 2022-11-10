package stacks_and_queues;

public class queueUsingLL {
    class Node {
        int data;
        Node next;
    }

    Node front;
    Node rear;

    queueUsingLL() {
        this.front = null;
        this.rear = null;
    }

    void enqueue(int val) {
        if (front == null) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            front = rear = temp;
        } else {
            Node temp = new Node();
            temp.data = val;
            rear.next = temp;
            rear = temp;
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
        }

        else {
            System.out.println(front.data);
            front = front.next;
        }
    }

}
