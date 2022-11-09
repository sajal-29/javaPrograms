package linearSearch;


public class LinearSearch { 
    public static void main(String[] args) {
        int[] arr = {14,45,43,67,9,436,87,2,8,24};
        String[] arrr = {"Hi","sajal","jain"};

        System.out.println(Linearsearch(arr, 436));

        System.out.println(Linearsearch2(arr, 24));

        System.out.println(Linearsearch3(arrr, "sajal"));
    }
    static int Linearsearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
         // For loop to iterate through every element in array
          for (int index = 0; index < arr.length; index++) {
                if(arr[index]==target){
                    return index;
                }
          }
        return -1;
    }
    static boolean Linearsearch2(int[] arr , int target){    // For answering in True or False only
        if(arr.length==0){
            return false;
        }
         // For loop to iterate through every element in array
          for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if(element==target){
                    return true;
                }
          }
        return false;
    }
    static String Linearsearch3(String[] arr , String target){      // For String array
        if(arr.length==0){
            return "null";
        }
         // For loop to iterate through every element in array
          for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if(str==target){
                return String.valueOf(i);
            }
          }
        return "null";
    }
    
}
