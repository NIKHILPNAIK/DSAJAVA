package FunctionsMethods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23,24,34,4,35,54,54,5);
        fun1(1,2,"nikhi","abhi","charan");
    }
    static void fun(int...v)//This allows to add variables of arugments
    {
        for (int num : v) {
            System.out.println(num + "");
        }
    }
    static void fun1(int a, int b,String...v)//variable must always be at the end
    {
        System.out.println(a +" "+b+" ");
        for(String s:v){
            System.out.println(" "+s);
        }
    }
}
