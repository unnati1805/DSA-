import java.util.Scanner;

public class EvenorOddPlaceSum {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
         int position = 0;
         int sum1 = 0;
         int sum2 = 0;
         while(num>0){
            position++;
            int lastdigit = num % 10;
            if(position%2==0){
                sum1= sum1 + lastdigit;
            }
            else{
                sum2 = sum2 + lastdigit;
            }
            num = num / 10;
        }
        System.out.println("even place sum:");
        System.out.println(sum1);
        System.out.println("odd place sum:");
        System.out.println(sum2);
        sc.close();
   } 
}
