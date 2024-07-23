package ArrayArrayLists;

public class MaxNuminArray {
    public static void main(String[] args) {
        int[] arr ={2,34,55,3,6};
        int maxval =maxnum(arr);
        System.out.println("The max is "+maxval);
        /*reverse(arr);*/
    }

    static int maxnum(int[]arr){
        int max = arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
    /*static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }*/
}
