class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
    public void reverseArray(int[] nums, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex++] = nums[endIndex];
            nums[endIndex--] = temp;
        }
    }
}