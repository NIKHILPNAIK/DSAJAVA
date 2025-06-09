public class LinearPenta {
    public static void main(String[] args) {
     int []arr = {13,21, 43, 34};
     int key = 43;

     int ind = search(arr, key);
        System.out.println("the key is at "+ind);
    }


    public static int search(int[] arr, int key){
        for(int i=0;i < arr.length ; i++){
            if(arr[i]== key){
                return i;
            }
        }
        return -1;
    }

}
