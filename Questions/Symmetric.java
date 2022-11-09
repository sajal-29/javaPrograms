package Questions;

public class Symmetric {
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9};
        int[][] arr1 = new int[3][3];
        int k=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(i==j){
                    System.out.print(arr[k]+" ");
                    k++;
                }
                else if(i-j == 1 || i-j == -1){
                    System.out.print(arr[2]+" ");
                }
                else if(i-j == 2 || i-j == -2){
                    System.out.print(arr[3]+" ");
                }

            }  
            System.out.println(); 
    }
}
}
    

