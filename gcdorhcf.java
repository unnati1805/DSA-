import java.util.Scanner;

public class gcdorhcf {
    public static int printgcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
            if(a==0)
            return b;
            else 
            return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printgcd(a,b));
        sc.close();
    }
}
