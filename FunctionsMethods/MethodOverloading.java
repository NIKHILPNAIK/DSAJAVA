package FunctionsMethods;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(34);
        fun("name");
        //When the functions having the same name but different kind of the parameters

    }
    static  void  fun(int a){
        System.out.println(a);
    }
    static  void fun(String name){
        System.out.println(name);
    }
}
