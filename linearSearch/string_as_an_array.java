package linearSearch;

public class string_as_an_array {
    public static void main(String[] args) {
        String str = "Hey There";
        char target = 'T';
        System.out.println(find(str,target));
        System.out.println(find1(str, target));
             
    }
    static int find(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;   
    }

    static boolean find1(String str,char target){
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;

    }
}
