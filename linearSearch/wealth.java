package linearSearch;

public class wealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6,7},
            {8,9},
        };
        int max = 0;
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
          int sum = 0;
         
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

                    }
                    arr1[i]=sum;
                    if(sum>max){
                        max = sum;
                    }
                 
                   
        }
        System.out.println(max);
        
        
    }
    
}
