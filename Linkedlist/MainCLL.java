package Linkedlist;

public class MainCLL {
    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();
        ll.insert(12);
        ll.insert(23);
        ll.insert(43);
        ll.insert(21);
        ll.display();
        ll.delete(12);
        ll.display();
    }
}
