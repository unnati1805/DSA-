import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int sum = 0;
        int copy = num;
        while(num>0){
            int ld = num%10;
            sum = sum + (ld*ld*ld);
            num = num/10;
        }
        num = copy;
        if(sum == num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
        sc.close();
    }
}
