package Questions;

public class row_column_Sum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum_row = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum_row = sum_row + arr[i][j];
            }
            System.out.println(sum_row);

            sum_row=0;
        }
        int sum_col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum_col = sum_col + arr[j][i];
            }
            System.out.println(sum_col);

            sum_col=0;
        }
    }
}
