package com.Nikhil1;

import java.util.Scanner;

public class Temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in C");
        float tempc = sc.nextFloat();
        float tempf = (tempc *9/5)+32;
        System.out.println("The temperature is " + tempf);
    }
}
