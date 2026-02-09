import java.util.Scanner;

public class PetersonNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int sum = 0;
        int copy = num;
        while(num>0){
            int ld = num%10;
            sum = sum + factorial(ld);
            num = num/10;
        }
        num = copy;
        if(sum == num){
            System.out.println("Peterson number");
        }
        else{
            System.out.println("not peterson number");
        }
        sc.close();
    }
}
