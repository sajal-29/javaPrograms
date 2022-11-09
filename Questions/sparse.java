package Questions;

public class sparse {
    public static void main(String[] args) {
        int[][] SparseArr = {
            {0,3,0,7,5},
            {0,0,5,3,0},
            {1,0,4,0,0},
            {0,0,3,0,0}
        };
        int size = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(SparseArr[i][j] != 0){
                    size++;
                }
            }
        }
        int[][] compactArray = new int[size][3];
        int k=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5 ; j++) {
                    if(SparseArr[i][j] != 0){
                        compactArray[k][0]=i;
                        compactArray[k][1]=j;
                        compactArray[k][2]=SparseArr[i][j];
                        k++;
                    }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(compactArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
