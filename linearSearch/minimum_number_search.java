package linearSearch;

public class minimum_number_search {
    public static void main(String[] args) {
        int[] arr = {14,45,43,67,9,436,87,2,1,8,24};
        int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
        
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println(min);
        
    }
    
}
