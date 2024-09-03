package Searching;

import java.util.Arrays;

public class linear
{
    public static void main(String[] args) {
        int[] arr = {1,5,53,84,23,88};
        int target = 23;
        int ind= linearsearch(arr, target);
        System.out.println("The position at"+ ind);
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index: arr){
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}

