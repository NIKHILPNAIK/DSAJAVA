package FunctionsMethods;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name ="Rahul";
        /*System.out.println(num);*/
        {
          //  int a=39; Cant initialise the value if it is in the function outside
            a = 33;  //But can reassign the new value
            name ="Nikhil";
            System.out.println(a);
            int c=33;
            //value initialised inside the block
        }
        int c =34;  //But you can initialise the same variable outside the block
    }
    static  void  random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
