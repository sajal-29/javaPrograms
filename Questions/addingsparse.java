package Questions;

public class addingsparse {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3},
            {2,3,4},
            {1,1,3},
        };
        int[][] arr2 = {
            {1,2,4},
            {1,3,4},
            {2,2,2}
        };
        int k=0;
        int[][] result = new int[k][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i]==arr2[i] && arr1[j]==arr2[j]) {
        
                        result[k][0] = arr1[i][j];
                        result[k][1] = arr1[i][j];
                        result[k][2] = arr1[i][j] + arr2[i][j];
                    }
                    
                        
                    
                    
            }
        }
    }
}
