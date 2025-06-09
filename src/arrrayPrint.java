import java.util.Arrays;

public class arrrayPrint {
    public static void main(String[] args) {
        int r=3;
        int c =3;
        int k =11;
        int [][]arr = new int[r][c];
        System.out.println(Arrays.deepToString(arr));

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=k;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
