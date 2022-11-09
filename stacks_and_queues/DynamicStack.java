package stacks_and_queues;

public class DynamicStack extends stack {
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }
    public boolean push(int val) throws Exception{
        if(this.isFull()){
             int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(val);
    }
}
