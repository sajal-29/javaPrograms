package linearSearch;

public class searching_multidimensional {
    public static void main(String[] args) {
        int[][] arr = {
            {5,2,3,4},
            {5,6},
            {7,8,9},
            {-10}
        };
        int target = 4;
        System.out.println(compare(arr,target));
    }
    static int compare(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return j;
                }
            }
        }
        return 0;

    }   
}
