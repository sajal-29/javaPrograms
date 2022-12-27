package stacks_and_queues;

import java.util.Stack;

public class sortingStack {
    public static void main(String[] args) {
        Stack<Integer> str = new Stack<>();
        str.push(23);
        str.push(34);
        str.push(6);
        str.push(456);
        str.push(345);
        str.push(9);
        Stack<Integer> temp = sortStack(str);
        while (!temp.empty()) {
            System.out.println(temp.peek());
            temp.pop();
        }

    }
    static Stack<Integer> sortStack(Stack<Integer> input)
{
    Stack<Integer> tmpStack = new Stack<Integer>();
    while (!input.empty())
    {
        // pop out the first element
        int tmp = input.peek();
        input.pop();
        
 
        // while temporary stack is not empty and top
        // of stack is greater than temp
        while (!tmpStack.empty() && tmpStack.peek() > tmp)
        {
            // pop from temporary stack and push
            // it to the input stack
            input.push(tmpStack.peek());
            tmpStack.pop();
        }
 
        // push temp in temporary of stack
        tmpStack.push(tmp);
    }
 
    return tmpStack;
}
}
