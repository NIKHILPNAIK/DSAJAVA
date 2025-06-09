public class LinearSearch {
    public static void main(String[] args) {
        int []arr= {12,34,23,26,56};
        int key = 24;
        boolean found = false;
        int pos = 0;

        for(int i=0;i<arr.length; i++){
            if(arr[i]== key){
                found = true;
                pos = i+1;
            }
        }
        System.out.println("The key is there: "+found +"The position is  "+pos);
    }
}
