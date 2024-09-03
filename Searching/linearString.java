package Searching;

public class linearString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target ='h';
        System.out.println(search1(name,target));
    }
    static boolean search(String str, char target){
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search1(String str, char target){
        for(char ch: str.toCharArray()){
            if(ch== target){
                return true;
            }
        }
        return false;
    }

}
