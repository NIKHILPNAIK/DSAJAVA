package ArrayArrayLists;
import java.util.Arrays;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        //Arrray of primitives
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            System.out.println(j + " ");
        }
        /*System.out.println(arr[5]); array out of bound*/

        System.out.println(Arrays.toString(arr));

        //Array of Objects

        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
