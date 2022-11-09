package stacks_and_queues;

public class stack {
    public int[] data;
    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    stack(){
        this(DEFAULT_SIZE);
        // this.data = new int[DEFAULT_SIZE];
    }

    public stack(int size) {
        this.data = new int[size];
    }
    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Can't add, Stack is full");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't pop, Stack is empty");
        }
    
        return data[ptr--]; 
    }
    public int peek(){
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
    
}
