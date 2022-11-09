package Questions;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int k=0;
        int[][] arr1 = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(i==j){
                    System.out.print(arr[k]+" ");
                    k++;
                }
                else{
                    System.out.print("0 ");
                }
            }  
            System.out.println(); 
        }
    }
}
