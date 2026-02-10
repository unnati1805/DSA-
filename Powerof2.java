import java.util.Scanner;

public class Powerof2 {
    public static boolean isPowerOfTwo(int n){
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return n==1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
        sc.close();
    }
}
