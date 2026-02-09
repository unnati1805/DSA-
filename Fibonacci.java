import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        int t0 = 0;
        int t1 = 1;
        System.out.println(t0);
        System.out.println(t1);
        
        for(int i=2; i<n; i++){
            int t2 = (t0+t1);
            t0 = t1;
            t1 = t2;
            System.out.println(t2);
        }
        sc.close();
    }
}
