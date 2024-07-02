package FunctionsMethods;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Nikhil");
        fun(12,12);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a);
    }

    static void fun(String name)
    {
        System.out.println(name);
    }
}
