public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {12, 3, 24, 56, 2};

        bubble(arr);

        System.out.println("The sorted array is :");
        for(int num: arr){
            System.out.println(num+" ");
        }
    }

    public static void bubble(int [] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
    }
}
