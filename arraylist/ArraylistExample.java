package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
            // list.add(88);
            // list.add(1, 55);
            // list.add(56);
            // list.add(34);
            // list.add(325);
            // list.add(90);
            // list.set(2, 44);
            // list.remove(4);
            // System.out.println(list);

            for (int i = 0; i < 4; i++) {
                list.add(sc.nextInt());
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(list.get(i)+" "); 
            }
    }        
}
