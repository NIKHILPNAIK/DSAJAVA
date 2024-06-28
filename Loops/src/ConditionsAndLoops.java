import java.util.Scanner;

public class ConditionsAndLoops {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
       switch (fruit){
           case "Mango":
               System.out.println("King of Fruit");
               break;
           case "Apple":
               System.out.println("Doctors enemy");
               break;
           case "Grape":
               System.out.println("Lets make some wine");
               break;
           case "Jackfruit":
               System.out.println("how the hell would i eat this fruit");
               break;
           default:
               System.out.println("Write some correct shit");

        }
    }
}
