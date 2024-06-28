import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers: ");
        int n = sc.nextInt();
        int p=0;
        int q=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(p);
            }
            else if(i==2) {
                System.out.println(q);
            }
            else {
                int s = q + p;
                System.out.println(s);
                p = q;
                q=s;

            }
        }


    }
}
