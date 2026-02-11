public class ArrayIsSorted {
    public static boolean isSorted(int arr[], int n){
        for(int i=1; i<n; i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,7,5,9};
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }
}
