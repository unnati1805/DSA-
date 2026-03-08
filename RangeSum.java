public class RangeSum {
    public NumArray(int[] nums) {
        int prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return prefixSum[right];
        }
        else{
            return prefixSum[right] - prefixSum[left-1];
        }
    }
}
