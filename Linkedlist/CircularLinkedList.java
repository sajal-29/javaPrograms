package Linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    int size;
        private class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
            }
        }
        CircularLinkedList(){
            this.size = 0;
        }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            tail = node;
            head = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node temp = head;
        if(head.val==val){
            head = head.next;
            tail.next = head;
            return;
        }   
        while(temp.next!=head){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val + "-->");
                temp = temp.next;
            }
            while(temp != head);
            System.out.println("HEAD");
            System.out.println();
        }
    }
    

}
