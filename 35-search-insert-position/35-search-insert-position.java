class Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0, max = nums.length -1;
        int mid = (min + max)/2;
        for(int i =0; i < nums.length; i++ ){
            mid = (min + max)/2;
            if(target < nums[mid]){
                max = mid-1;
            
                
            }
            else if(target > nums[mid]){
                min = mid+1;
            }
            else{
                return mid;
            }
        }
        return min;
    }
}