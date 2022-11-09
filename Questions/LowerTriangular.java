package Questions;

public class LowerTriangular {

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] arr1 = new int[3][3];
        int k=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(i==j || i>=j){
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

