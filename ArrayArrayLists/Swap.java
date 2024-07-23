package ArrayArrayLists;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[]  arr = { 1, 3,4,5,6};
        /*swap(arr,1,3);*/
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int in1, int in2){
        int temp = arr[in1];
        arr[in1]= arr[in2];
        arr[in2] = temp;
    }
    static void reverse(int[] arr){
        int start =0;    // for the index of the first element in array
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

}
