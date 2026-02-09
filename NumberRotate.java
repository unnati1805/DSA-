import java.util.Scanner;

public class NumberRotate {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        System.out.println("Enter the number of rotations");
        int r = sc.nextInt();
        int count=0;
        int copy = num;
        while(num>0){
            count++;
            num = num / 10;
        }
        num = copy;
        //if rotation>count then
        r = r % count; // within range
        int rd = num % (int)Math.pow(10, r);
        int ld = num / (int)Math.pow(10, r);
        num = rd*(int)Math.pow(10, count-r)+ld;
        System.out.println(num);
        sc.close();
    }
}
