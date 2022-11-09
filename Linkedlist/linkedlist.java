package Linkedlist;

public class linkedlist {

    private Node head;
    private Node tail;
    private int size;

    linkedlist(){
        this.size = 0;
    }

        class Node {
        private int data;
        private Node next;
        
         Node(int data){
                this.data = data;
                this.next = null;
            }
        Node (int data , Node next){
            this.data = data;
            this.next = next;
        }    
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;

     }
     public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }
        Node first = head;
        for (int i = 1; i < index; i++) {
            first = first.next;
        }
        
        Node node = new Node(value);
        node.next = first.next;
        first.next = node;
        size++;
     }
     public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
     }
     public int deleteFirst(){
        int first = head.data;
        head = head.next;
        size--;
        return first;
     }
     public int deleteLast(){
        int first = tail.data;
        if(head == null){
            tail = null;
        }
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;

        return first;
     }
     public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
         Node first = get(index - 1);
         int val = first.next.data;
         first.next = first.next.next;
        size--;
        return val;
     }
    public void swap(int index1, int index2){
        Node first1 = get(index1);
        Node first2 = get(index2);
        Node mkc = get(index1-1);
        first1.next = first2.next;
        mkc.next = first2;
        first2.next = first1;

    }
    public void deleteOccurences(int val){
        Node first = head;
        Node prev = null;
        if(head.data==val){
            head = head.next;
        }
        while(first!=null){
            while(first!=null && first.data!=val){
                prev = first;
                first = first.next;
            }
            if(first == null){
                return;
            }
                prev.next = first.next;
                first = prev.next;
                size--;
            
        }
    }
    public int getMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        head = slow;
        return slow.data;
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while( current!=null){
            current.next = prev; 
            prev = current;
            current = next;
        if(next!=null){
            next = next.next;   
        }
    }
        tail = head;
        head = prev;
    }
    public static linkedlist Sort(linkedlist list1, linkedlist list2){
        Node first = list1.head;
        Node second = list2.head;
        linkedlist ans = new linkedlist();
        
        while(first != null && second !=null){
            if(first.data < second.data){
                ans.insertLast(first.data);
                first = first.next;
            }
            else{
                ans.insertLast(second.data);
                second = second.next;
            }
        }
        while(first != null){
            ans.insertLast(first.data);
            first = first.next;
        }
        while(second != null){
            ans.insertLast(second.data);
            second = second.next;
        }
        return ans;

    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node first = head;
        while(first != null){
            if(first.data == value){
                return first;
            }
            first = first.next;
        }
        return null;

    }
    public void display(){
        Node first = head;
        while(first != null){
            System.out.print(first.data+"-->");
            first = first.next;
        }
        System.out.println("End");
        System.out.println();
     }
     public void displaySize(){
        System.out.println(size);
     }
}  
