public class LargestElementArray{
    public static int findLargest(int arr[], int n){
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,4,3};
        int n = arr.length;
       System.out.println(findLargest(arr,n));
    }
}