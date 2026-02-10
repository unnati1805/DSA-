import java.util.Scanner;

public class primenumber {
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count = count + 1;
            if((n%i)!=i){
                 count = count + 1;
            }
        }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
