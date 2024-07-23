package ArrayArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  4  4  6
        4  5  5
        3  5  5*/
       /* int [][] arr = new int[3][];*/  //[rows] [cols]
/*
        int [] [] arr ={
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };*/

        //Input
        int [][] arr = new int[3][2];
        System.out.println(arr.length); //Gives the number of rows
        arr[0] = new int[4];
        System.out.println(Arrays.toString(arr[0]));
        /*arr[0] = new int[4]; *///If you wanna change the colums for the first row or any other

        for(int row=0; row<arr.length;row++){
            //for each column in the row
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]= sc.nextInt();
            }
        }
/*        for(int row=0; row<arr.length;row++){
            //for each column in the row
            for(int col=0; col<arr[row].length; col++) //arr[row] length so that will be below that line
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/
        /*for (int row =0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
*/
        for(int[] num: arr){
            System.out.println(Arrays.toString(num)+" "); //Enhanced for loop for the better complexity
        }
    }
}
