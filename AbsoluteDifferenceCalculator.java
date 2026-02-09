import java.util.Scanner;

public class AbsoluteDifferenceCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
         System.out.println("enter the second number");
        int b = sc.nextInt();
        int res = Math.abs(a-b);
        if(res>10){
            System.out.println("large difference");
        }
        else{
            System.out.println("small difference");
        }
        sc.close();
    }
}
