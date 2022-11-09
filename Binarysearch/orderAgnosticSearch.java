package Binarysearch;

public class orderAgnosticSearch {
    public static void main(String[] args) {
        int[] arr = {-98,-76,-43,-4,0,2,4,6,45,344,564};

        int[] arr1 = {98,76,43,4,2,-4,-6,-45,-344,-564};
        
            System.out.println(checkArr(arr, 2));

            System.out.println(checkArr(arr1, -6));
        }

    static int BinarySearchAscending(int[] arr , int target) {
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
    static int BinarySearchDescending(int[] arr , int target) {
        int start = 0;

        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end - start)/2; //

            if(arr[mid]<target){
                end = mid-1;
            }
            else if (arr[mid]>target) {
                start = mid+ 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    } 
    static int checkArr(int[] arr,int target){

        if(arr[0]>arr[arr.length-1]){
            return BinarySearchDescending(arr, target);
        }

        if(arr[0]<arr[arr.length-1]){
           return BinarySearchAscending(arr, target);
        }

        return -1;
    }
    }

