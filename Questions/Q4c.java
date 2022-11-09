package Questions;

public class Q4c {
     
    static void transpose(int a[][], int b[][],int n)
    {
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                b[i][j] = a[j][i];
    }
     
    public static void main (String[] args)
    {
        int n = 2;
        int a[][] = { {1, 1},
                      {2, 2}};
     
        int b[][] = new int[n][n], i, j;
     
        transpose(a, b,n);
     
        System.out.println("Answer:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }

}
