public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int closestSum = nums[0] + nums[1] +nums[2];
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(target - sum) < Math.abs(target - closestSum)){
                        closestSum = sum;
                    }
                }
            }
        }
        
                    return closestSum;
    }
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
