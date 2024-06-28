package DSA2;

import java.util.Scanner;

public class ConditionsAndLoops {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruit");
            case "Apple" -> System.out.println("Doctors enemy");
            case "Grape" -> System.out.println("Lets make some wine");
            case "Jackfruit" -> System.out.println("how the hell would i eat this fruit");
            default -> System.out.println("Write some correct shit");
        }
    }
}
