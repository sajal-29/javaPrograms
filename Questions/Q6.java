// --------------------------Question 6-----------------------------

package Questions;

public class Q6 {
   public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
            }    
        }  
     }  
}  
    public static void main(String[] args) {  
                int arr[] ={5,435,756,0,-34,-46};  
                    
                bubbleSort(arr);
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}
