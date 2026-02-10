import java.util.Scanner;

public class selectionsort {
    public static void sortSelection(int a[]){
        for(int i=0; i<a.length - 1; i++){
            int min = i;
            for(int j=i; j<a.length; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        sortSelection(a);
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
