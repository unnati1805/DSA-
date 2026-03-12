import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {       
    //   Arrays.sort(nums);
    //   for(int i=1; i<nums.length; i++){
    //     if(nums[i] == nums[i-1]){
    //         return true;
    //     }
    //   }
    //   return false;
    HashSet<Integer> set = new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
