package stacks_and_queues;

public class stacksUsingLL {
    class Node{
        int data;
        Node next;
    }
    Node top;
    stacksUsingLL(){
        this.top = null;
    }

    void push(int val){
        if(top==null){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            top = temp;
        }
        else{
            Node temp = new Node();
            temp.data = val;
            temp.next = top;
            top = temp;
        }
    }
    void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        else{
            System.out.println(top.data);
            top = top.next;
        }
        
        

    }
}
