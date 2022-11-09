package Questions;

public class spiralMatrix {
    public static void main(String[] args) {
            int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
            int min_col = 0;
            int max_col = arr[0].length -1 ;
            int min_row = 0;
            int max_row = arr.length -1 ;

            for (int i = min_col ; i <= max_col; i++) {
                System.out.print(arr[min_row][i]);
            }
            min_row++;
            for (int i = min_row; i <= max_row; i++) {
                System.out.print(arr[i][max_col]);
            }
            max_col--;
            for (int i = max_col; i >= min_col; i--) {
                System.out.print(arr[max_row][i]);
            }
            max_row--;
            for (int i = min_col; i <= max_col; i++) {
                System.out.print(arr[max_row][i]);
            }
           


        }   
}
