import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int arr[], int low, int high){
        if(low>=high)
        return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        int temp[]=new int[high-low+1];
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k] = arr[left];
                k++;
                left++;
            }
            else{
                temp[k] = arr[right];
                k++;
                right++; 
            }
        }
    while(left<=mid){
        temp[k] = arr[left];
                k++;
                left++;
}
while(right<=high){
    temp[k] = arr[right];
                k++;
                right++; 
    }
    for(int i=0; i<temp.length; i++){
        arr[low+i] = temp[i];
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
