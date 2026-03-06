import java.util.Arrays;

public class ConcatenateArray {
    public static int[] concatenateArray(int nums[]){
        int ans[] = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        ConcatenateArray solution=new ConcatenateArray();
        int nums[] = {1,2,1};
        int[] result =solution.concatenateArray(nums); 
        System.out.println("New Array is: " + Arrays.toString(result)); 
    }
}
