package loops1.Nikhil;
import java.util.Scanner;

public class WhileL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

      // while(num<=10) {
        // System.out.println(num);
            num++;
        // }
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=num);
    }
}
