import java.util.Arrays;

public class MoveZeroesToEnd {
    public static int[] moveZeros(int arr[]){
        int n = arr.length;
        int j = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        for(int i=j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,4,3,6,0,0,5,8,4};
        int result[] = moveZeros(arr);
        System.out.println(Arrays.toString(result));
    }
}
