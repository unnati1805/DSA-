import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int copy = num;
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        num = copy;
        if(sum == num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }
        sc.close();
    }
}
