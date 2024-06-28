import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        System.out.println(sc.next().trim());
        //Trim removes the spaces and only shows the string
        if (ch >='a'&& ch<='z')
            System.out.println(ch+"Lowercase");
        else{
            System.out.println(ch+"Uppercase");
        }

    }
}
