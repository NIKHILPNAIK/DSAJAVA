package Loops.src;

import java.util.Scanner;

public class Calculator {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ans=0;
        boolean con=true;
        System.out.println("Enter the operator: ");
        char op = sc.next().trim().charAt(0);
        while(con){
            if(op=='+'|| op=='-'||op=='*'|| op=='/'){
                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the Second number: ");
                int b= sc.nextInt();
                if(op=='+'){
                    ans = a+b;
                }
                if(op=='-'){
                    ans = a-b;
                }
                if(op=='*'){
                    ans = a*b;
                }
                if(op=='/'){
                    ans = a/b;
                }
                
                }
                else{
                    System.out.println("Invalid");
                }
            }
        }

    }

