package Linkedlist;

public class doublyLinkedList {
   public Node head;
    int size;
    doublyLinkedList(){
        this.size=0;
    }
    public class Node{
        int data;
        public Node next;
        public Node prev;

        Node(int data){
            this.data = data;
        }

    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
        
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;

        if(head==null){
            node.prev = null;
            head = node;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }
    public void insertAfter(int index,int val){
        if(index==0){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        Node temp = get(index);
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
        size++;
    }
    public void insert(int index, int val){
        if(index==0){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        Node temp = get(index);
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp.prev;
        node.prev.next = node;
        node.next.prev = node;

    }
    public void shiftNext(int index){
        Node temp1 = get(index);
        Node temp2 = get(index+1);
        if(index == size -1 && (index+1)!=size-1){
            deleteLast();
            size--;
            return;
        }      
        if(index == 0){
            temp1.next = temp2.next;
            temp2.prev = null;
            temp2.next.prev = temp1;
            temp1.prev = temp2;
            temp2.next = temp1;
            head = temp2;
            return;
        }
        temp1.next = temp2.next;
        temp2.prev = temp1.prev;
        temp2.next.prev = temp1;
        temp1.prev.next = temp2;
        temp1.prev = temp2;
        temp2.next = temp1;
    }
    public void shiftIndex(int index1, int index2) {
        Node temp1 = get(index1);
        Node temp2 = get(index2);
        temp1.next = temp2.next;
        temp1.prev = temp2.prev;
        temp2.next = temp1.next;
        temp2.prev = temp1.prev;
        temp1.next.prev = temp2;
        temp2.prev.next = temp1;
        temp2.next.prev = temp1;
        temp1.prev.next = temp2;


    }
    public void deleteFirst(){
        // Node node = head;
        head = head.next;
        head.prev = null;
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        size--;
    }
    public void delete(int index){
        if(index == 0){
             deleteFirst();
             return;
        }
        else if(index == size-1){
             deleteLast();
             return;
        }
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void displaySize(){
        System.out.println("The size of doublyLinkedList is " + size);
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + "-->");
           node = node.next;
        }
        System.out.println("End");
        System.out.println();
    }
    public void displayReverse(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node last = temp;
        while(last != null){
            System.out.print(last.data + "-->");
            last = last.prev;
        }
        System.out.println("End");
        System.out.println();
        
    }
}
