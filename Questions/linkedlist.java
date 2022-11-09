package Questions;

public class linkedlist {

        class Node {
           int data;
           Node next;
        
         Node(int data){
                this.data = data;
                this.next = null;
            }
        }
            Node head = null;
            Node tail = null;
            
         void addNode(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }
                else{
                    tail.next = newNode;
                    tail = newNode;
                   
                }
            }
         void display(){
                Node current = head;

                if(head==null){
                    System.out.println("List is empty");
                }
                else{
                    System.out.println("The elements of List are: ");
                    System.out.print("[ ");
                    while(current != null){
                        System.out.print(current.data+" ");
                        current = current.next;
                    }
                    System.out.println("]");
                }
            }
            public static void main(String[] args) {
                linkedlist ll = new linkedlist();
                ll.addNode(5);
                ll.addNode(6);
                ll.addNode(7);
                ll.display();
            }
        
    }
   


