import java.util.Scanner;

public class Powerof3 {
    public static boolean isPowerOfThree(int n){
        while(n>2){
            if(n%3!=0){
                return false;
            }
            n=n/3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
        sc.close();
    }
}
