package loops1.Nikhil;
import java.util.Scanner;
public class counting {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total number");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            int rem = num%10;
            if(rem==3){
                count++;
            }
            num= num/10;
        }
        System.out.println(count+" is the answer");
    }
}
