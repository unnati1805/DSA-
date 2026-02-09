import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if(ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
        sc.close();

    }
}
