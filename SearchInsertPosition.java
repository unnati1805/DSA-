public class SearchInsertPosition {
     public static int searchInsert(int[] nums, int target) {
         int start=0;
       int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
           else if(nums[mid]<target){//right
            start=mid+1;
        }
        else{//left
           end=mid-1; 
        }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}
