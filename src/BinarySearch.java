public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {12, 15,17,22,45};
        int key= 45;
        int ind = Search(arr, key);
        System.out.println(ind);
    }

    public static int Search(int []arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
}
