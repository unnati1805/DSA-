import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of times");
        int n= sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col<=row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
         for(int row=1; row<=n-1; row++){
            for(int col=1; col<=n-1; col++){
                if(col>=row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}


