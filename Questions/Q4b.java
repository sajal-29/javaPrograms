package Questions;

public class Q4b {
    
    public static void main(String[] args)
    {
 
        int row1 = 2, col1 = 2, row2 = 2, col2 = 1;
 
        int a[][] = { { 1, 1 },
                      { 2, 2 }};
 
        int b[][] = { { 1,},
                      { 2 }}; 
 
        multiplyMatrix(row1, col1, a,
                       row2, col2, b);
    }
    static void printMatrix(int m[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(m[i][j] + " ");
 
            System.out.println();
        }
    }
 
    static void multiplyMatrix(
        int row1, int col1, int a[][],
        int row2, int col2, int b[][])
    {
        int i, j, k;
 
        System.out.println("\nMatrix A:");
        printMatrix(a, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(b, row2, col2);
 
        if (row2 != col1) {
 
            System.out.println(
                "\nMultiplication Not Possible");
            return;
        }
  
        int c[][] = new int[row1][col2];
 
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
 
        System.out.println("\nAnswer:");
        printMatrix(c, row1, col2);
    }
}
