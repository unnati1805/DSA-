public class LongestSubarrayWithSumK{
    public static int getLongestSubarray(int arr[], int k){
        long sum = arr[0];
        int maxlen = 0;
        int n = arr.length;
        int left = 0;
        int right = 0;
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right-left+1);
            }
            right++;
            if(right < n){
                sum = sum + arr[right];
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        System.out.println(getLongestSubarray(arr, k));
    }
}