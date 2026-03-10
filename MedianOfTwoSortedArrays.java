import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        for(int i=0; i<n; i++){
            arr[i]=nums1[i];
        }
        for(int i=0; i<m; i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        int len = arr.length;
        if(len % 2 == 0){
            return (arr[len/2] + arr[len/2 - 1]) / 2.0;
        } 
        else{
            return arr[len/2];
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
