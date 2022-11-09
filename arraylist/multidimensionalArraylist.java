package arraylist;

import java.util.*;
public class multidimensionalArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation of list just like we did in 2d array
        // for ex: int[][] arr = new INT[3][3];

       for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
       }

       // Taking input from the user in index i 
       // Each list act as an individual list of their own.
         
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
       }
     System.out.println(list);
    }
}
