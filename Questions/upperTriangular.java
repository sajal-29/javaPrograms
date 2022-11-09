package Questions;

public class upperTriangular {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,3,5,9,2,4,5};
        int[][] arr1 = new int[4][4];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(i<=j){
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

