import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of times");
        int n= sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(col==row || col==(n-row+1) || row==1 || row==n){
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
