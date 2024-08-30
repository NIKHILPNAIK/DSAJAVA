package ArrayArrayLists;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean var = IsBs(a,b,c,d);
        System.out.println(var);
    }
    public static Boolean IsBs(int a,int b,int c,int d) {
        if(a==c && b==d){
            return true;
        }
        while (a < c && b<d) {
            if (a > c || b > d) {
                return false;
            } else {
                IsBs(a + b, b, c, d);
                IsBs(a, b + a, c, d);
            }
        }

        return true;

    }
    }
