package Binarysearch;

public class binary_search_algo {
    public static void main(String[] args) {
        int[] arr = {-98,-76,-43,-4,0,2,4,6,45,344,564};

      
        
            System.out.println(BinarySearch(arr, 0));
        }

    static int BinarySearch(int[] arr , int target) {
        int start = 0;
        
        int end = arr.length-1;
        
        
        while(start<=end){
            int mid = start + (end - start)/2; //

            if(arr[mid]>target){

                end = mid-1;
            }
            else if (arr[mid]<target) {

                start = mid+ 1;
            }
            else{

                return mid;
            }
        }
        return -1;
    }    
}