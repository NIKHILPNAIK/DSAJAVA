package FunctionsMethods;

public class Shadowing {
    static int x =90;  //This is available for all the block
    public static void main(String[] args) {
        System.out.println(x);
        int x=30;
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
