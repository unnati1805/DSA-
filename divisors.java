import java.util.Scanner;

public class divisors {
    public static void printDivisors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        printDivisors(n);
        sc.close();
    }
}
