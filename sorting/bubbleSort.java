package sorting;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        boolean swap = false;
    
        for (int i = 1; i < arr.length; i++) {
          for (int j = 0; j < arr.length-i; j++) {
                   if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                if(!swap){
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    

