public class SecondOrderElement {
    public static int secondLargest(int arr[], int n){
        int largest = arr[0];
        int slargest = -1;
        for(int i = 1; i < n; i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static int secondSmallest(int arr[], int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int arr[] = {6,1,8,3,5,4};
        int n = arr.length;
        int slargest = secondLargest(arr, n);
        int ssmallest = secondSmallest(arr, n);
        System.out.println(slargest);
        System.out.println(ssmallest);
    }
}
