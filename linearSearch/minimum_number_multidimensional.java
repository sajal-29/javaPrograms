package linearSearch;

public class minimum_number_multidimensional {
    public static void main(String[] args) {
        int[][] arr = {
            {5,2,3,4},
            {5,6},
            {7,8,9},
            {-10}
        };
        System.out.println(min(arr));

    }
    static int min(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;

    }
    
}
