public class MaximumConsecutiveOnes {
    public static int maximumConsecutiveOnes(int nums[]){
        int maxi = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1,0,1,1};
        System.out.println(maximumConsecutiveOnes(nums));
    }
}
