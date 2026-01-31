import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of times");
        int n= sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=1; col<=(2*n-1); col++){
                if(col==(n-row+1) || col==(n+row-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int col=1; col<=(2*n-1); col++){
                if(col==(n-row+1) || col==(n+row-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int col=1; col<=(2*n-1); col++){
                if(col==(n-row+1) || col==(n+row-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int col=1; col<=(2*n-1); col++){
                if(col==(n-row+1) || col==(n+row-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
