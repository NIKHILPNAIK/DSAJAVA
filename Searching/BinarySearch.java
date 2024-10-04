package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {3,6, 41,67,87};
        int tar =87;
        System.out.print(search1(arr,tar));
    }
    public static boolean search1(int [] arr, int tar) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (tar == arr[mid]) {
                return true;
            } else if (tar < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
