import java.util.Arrays;

public class LeftRotateArray {
    public static int[] rotateArray(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
         int result[] = rotateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
