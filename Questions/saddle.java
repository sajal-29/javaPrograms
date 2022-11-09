package Questions;
public class saddle {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,2},
            {4,5,5},
            {9,8,7}
        };
        int min=0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
           min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                    col = j;
                }
                
            }
        }
        int max = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            
             if(max<arr[i][col]){
                    max = arr[i][col];
                    row = i;
                }
    
        }

        if(min==max){
            System.out.println("The Saddle point is "+min);
            System.out.println("Index is "+"( "+row+","+col+" )");
        }
        
    }
    
}
    