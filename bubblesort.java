import java.util.Scanner;

public class bubblesort {
    public static void sortBubble(int arr[], int n){
        for(int i =0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size");
         int n= sc.nextInt();
        System.out.println("enter the array");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        sortBubble(a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
