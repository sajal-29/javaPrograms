package arrays;

public class findMaxnumber {
    
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,7};
        System.out.println(findMax(arr));
        System.out.println(findMax_Index(arr, 1, 4));
    }
    static int findMax(int[] arr){
        int Max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    static int findMax_Index(int[]arr ,int index1,int index2){
        int Max = arr[0];
        for(int i=index1 ;i<=index2 ;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        return Max;

    }
    
}
