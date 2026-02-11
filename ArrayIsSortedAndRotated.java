public class ArrayIsSortedAndRotated {
    public static boolean isSortedAndRotated(int arr[]){
        int n = arr.length;
        int rotations = 0;
        for(int i=1; i<n; ++i){
            if(arr[i] < arr[i-1]){
                rotations++;
            }
        }
        if(arr[0] < arr[n-1]){
            rotations++;
        }
        return rotations <= 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(isSortedAndRotated(arr));
        int arr2[] = {2,1,3,4,5};
        System.out.println(isSortedAndRotated(arr2));
    }
}
