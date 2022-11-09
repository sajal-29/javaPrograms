package Questions;

public class principalNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,9,1,4};
        int[] arr1 = {3,5,9,1,4};
        int sum = 0;
        int a;
        int size = arr.length;
        // int[] arr1 = new int[arr.length-size];
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                
            }
            if(arr[i]>(sum/(arr.length-i))){
                System.out.println(i);
                a=i;
                for (int k = i; k < arr.length; k++) {
                    arr1[a] = arr[i+1];
                }
                size--;
        
            }
            sum=0;
        }
        System.out.println(size);
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]);
            }
    }
    
}
