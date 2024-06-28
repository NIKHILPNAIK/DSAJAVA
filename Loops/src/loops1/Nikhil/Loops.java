package loops1.Nikhil;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();


        //for(initiation; condition; incr/decr);
       for(int i=1;i<=num;i++){
           System.out.println(i);
       }
    }
}
