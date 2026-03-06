import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) { 
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j}; 
        //         }
        //     }
        // }
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                int index = map.get(target-nums[i]);
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        TwoSum solution=new TwoSum();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] result =solution.twoSum(nums, target); 

        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices are: " + Arrays.toString(result)); 
        }
    }
}
