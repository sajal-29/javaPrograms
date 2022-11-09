package sorting;
import java.util.Arrays;
public class demoSelection {
    public static void main(String[] args) {
        int[] arr = {3,4,2,-13,5,0};

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[max]<arr[j]){
                    max = j;   
                }  
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;    
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
