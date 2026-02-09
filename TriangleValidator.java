import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first side");
        int a = sc.nextInt();
        System.out.println("enter the second side");
        int b = sc.nextInt();
        System.out.println("enter the third side");
        int c = sc.nextInt(); 
        if((a+b>c) && (b+c>a) && (a+c>b)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
        sc.close();
    }
}
