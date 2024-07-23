package ArrayArrayLists;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*int a =10;*/

        //syntax
        //datatype[] var_name = new datatype[size];
//        int[] num = new int[5];
        //or directly
        /*int[] rnos ={2,3,4,5,5,4};*/
        Scanner sc = new Scanner(System.in);
        int[] ros;
        ros = new int[5];
        for(int i=0;i<ros.length;i++){
            ros[i] = sc.nextInt();
        }
        for(int num: ros){
            System.out.print(num+" ");
        }

 /*String arr[] = new String[5];
        System.out.println(arr[0]);
  //Output will be the null rather than 0
        for(String nik: arr){
            System.out.print(nik+" ");
        }*/


    }

}
