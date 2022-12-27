package practice;

public class heap {
    int[] arr = new int[100];
    int size;
    heap(){
        this.size = 0;
    }

    void insert(int val){
        size = size + 1; 
        int index = size;
        arr[index] = val;
        while(index>1){
            int i = index/2;
            if(arr[index] > arr[i/2]){
                swap(i,index);
                index = i;
            }
            else{
                return;
            }
        }
    }

    void showSize(){
        System.out.println(size);
    }

    int delete(){
        if(size==0){
            return -1;
        }
        int last = arr[size];
        arr[1] = last;
        size--;
        int i = 1;
        while(i<size){
            int left = 2*i;
            int right = 2*i + 1;
            
            if(arr[left] > arr[i]){
                swap(left,i);
                i = left;
            }
            else if(arr[right] > arr[i]){
                swap(right,i);
                i = right;
            }
            else{
                break;
            }
        }
        return last;
    }

    

    private void swap(int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index]= temp;
    }
    void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
