public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
    //     double maxAvg = Integer.MIN_VALUE;
    //     for(int i=0; i<=nums.length-k; i++){
    //          int sum = 0;
    //         for(int j=i; j<i+k; j++){
    //             sum = sum + nums[j];
    //         }
    //         double avg = (double)sum/k;
    //         maxAvg = Math.max(avg, maxAvg);
    //     }
    //    return maxAvg; 
    double maxAvg = Integer.MIN_VALUE;
    int sum = 0;
    for(int i=0; i<k; i++){
        sum = sum + nums[i];
    }
    maxAvg = (double) sum / k; 
    for(int j=k; j<nums.length; j++){
        sum = sum + nums[j] - nums[j-k];
         maxAvg = Math.max(maxAvg, (double)sum/k);
    }
    return maxAvg;
    }
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
