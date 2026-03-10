import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int [m+n];
        for(int i=0; i<m; i++){
            arr[i] = nums1[i];
        }
        for(int i=0; i<n; i++){
            arr[m+i] = nums2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<m+n;i++){
            nums1[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
