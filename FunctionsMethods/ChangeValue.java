package FunctionsMethods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create array
        int[] arr = {1, 2, 4, 3, 8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] num) {
        num[0]=99;   //if you make a change a object with reference variable
    }
}

