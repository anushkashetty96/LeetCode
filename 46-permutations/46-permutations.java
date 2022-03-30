class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        generatePerms(0,nums, new ArrayList(),result);
        return result;
    }
    void generatePerms(int index, int[] nums, List<Integer> curr, List<List<Integer>> result){
        if(index == nums.length)
            result.add(toList(nums));
        else{
           for(int i = index; i < nums.length;i++){
            swap(i,index,nums);
            generatePerms(index+1, nums,curr,result);
            swap(i,index,nums);
        } 
        }
        
    }
    
    void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList();
        for(int i : nums)
            res.add(i);
        return res;
    }
    
}