package linearSearch;

public class searching_even_num {
    public static void main(String[] args) {
        int[] arr = {2,3,4,56,78,99};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0){
                    count++;
                    System.out.print(arr[i]+" ");
                }
        }
        System.out.println();
        System.out.println("Total even digits are "+count);
    }
    
}
