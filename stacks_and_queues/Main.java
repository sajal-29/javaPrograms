package stacks_and_queues;

import Questions.spiralMatrix;

public class Main {
    public static void main(String[] args) {
        // DynamicStack str = new DynamicStack(5);
        // str.push(30);
        // str.push(78);
        // str.push(56);
        // str.push(34);
        // str.push(21);
        // str.push(33);

        // System.out.println(str.pop());
        // System.out.println(str.pop());
        // System.out.println(str.pop());
        // System.out.println(str.pop());
        // System.out.println(str.pop());
        Stack_usingLinkedList str = new Stack_usingLinkedList();
        str.push(4);
        str.push(3);
        str.push(0);
        str.push(8);
        str.display();
        str.pop();
        str.pop();
        str.pop();
        str.display();
        str.pop();

    }    
}
