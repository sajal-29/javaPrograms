package Linkedlist;

public class MainDLL {
    public static void main(String[] args) {
        doublyLinkedList ll = new doublyLinkedList();
        ll.insertFirst(19);
        ll.insertFirst(54);
        ll.insertFirst(63);
        ll.insertLast(7);
        ll.insertAfter(2, 55);
        ll.display();
        ll.insert(2, 10);
        ll.display();
        ll.displaySize();
        ll.deleteFirst();
        ll.deleteLast();
        ll.display();
        ll.delete(2);
        ll.display();
      //  ll.shift(3);
        ll.display();
        ll.displaySize();
        ll.shiftIndex(1, 3);
        ll.display();
    }
}
