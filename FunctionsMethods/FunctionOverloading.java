package FunctionsMethods;

public class FunctionOverloading {
     static int a=10;
    public static void main(String[] args) {
       FunctionOverloading obj = new FunctionOverloading();
       obj.fun1(3);
    }
      void fun1(int b){
        System.out.println(a+""+b);
    }

}
