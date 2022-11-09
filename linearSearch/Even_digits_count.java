package linearSearch;

public class Even_digits_count {
    public static void main(String[] args) {

        int[] arr = {44,6544,765,3323};
               
          System.out.println(numberOfDigits(arr));
    }

    static int numberOfDigits(int[] arr) {

        int even_counter=0;
        for(int num:arr){

          
            if(evenNum(num)){

                even_counter++;
            }
        } 
            return even_counter;
        }
        
    static boolean evenNum(int num) {

        int count = digits(num);
        return count%2==0;
    }

    static int digits(int num) {
        int count=0;
        while(num>0){

            count++;
            num=num/10;
            
        }
        return count;
        
    }
    
}
