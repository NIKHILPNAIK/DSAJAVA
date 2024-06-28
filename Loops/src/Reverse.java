import java.util.Scanner;

public class Reverse {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 234254;
        int rev =0;
        while(num>0){
//            Reverse the num using the remainder method and  adding it using multiply and add method

            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.print(rev);
    }
}
