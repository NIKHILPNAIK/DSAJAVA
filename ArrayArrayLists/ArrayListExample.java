package ArrayArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
      /*  list.add(67);
        list.add(672);
        list.add(6);
        list.add(7);
        list.set(0,99);   //Sets the 0 index to the 99 number
        list.remove(2);*/ //removes the given index
//        System.out.println(list.contains(7));
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
        for(int num:list){
            System.out.print(num+" ");
        }
    }
}
