package stacks_and_queues;

public class Stack_usingLinkedList {
    int size;
    Node top;
        
    public class Node {
        int data;
        Node next;
    }
    Stack_usingLinkedList(){
        this.size = 0;
        this.top = null;
    }
    public void push(int val){
        Node node = new Node();
        if(node == null){
            System.out.println("Stack is full");
            return;
        }

        node.data = val;
        node.next = top;
        top = node;
        size++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
    }
    public void display() {
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next; 
        }
    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    private boolean isEmpty() {
        return top == null;
    }
}
