import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of times");
        int n= sc.nextInt();
        
        for(int row=1; row<=n; row++){
            char ch = 'A';
            for(int col=1; col<=n; col++){
                if(col<=row){
                    System.out.print(ch);
                }
                ch++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
