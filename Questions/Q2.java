// -------------------------Question 2-----------------------------

package Questions;

public class Q2 {
    
        public static void main(String[] args) {
         int[] arr =  {1,2,3,3,4};
         int size = arr.length;

         for (int i = 0; i < RmDoubles(arr, size); i++) {
            System.out.print(arr[i]+" ");
         }
        }
     static int RmDoubles(int[] arr , int size){
        
 
        int[] temp = new int[size];
        int j = 0;
 
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
 
        temp[j++] = arr[size - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
 
        return j;

     }
     
}
