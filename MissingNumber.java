public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;
        int N = n+1;
        for(int i=0; i<n; i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^nums[i];
        }
        xor1 = xor1^N;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,4,5};
        System.out.println(findMissingNumber(nums));
    }
}
