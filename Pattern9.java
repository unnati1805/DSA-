import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of times");
        int n= sc.nextInt();
        int num =1;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col<=row){
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
