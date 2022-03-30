class Solution {
   public List<List<Integer>> permuteUnique(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        generatePerms(0,nums, new ArrayList(),result);
        return result;
    }
    void generatePerms(int index, int[] nums, List<Integer> curr, List<List<Integer>> result){
        if(index == nums.length)
            result.add(toList(nums));
        else{
           
           for(int i = index; i < nums.length;i++){
                if(i != index && !canPermutate(index,i,nums) )
                continue;
                
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
    
    boolean canPermutate(int in, int j, int[] nums){
        for(int i = in; i<j;i++){
            if(nums[i] == nums[j])
                return false;
            
        }
        return true;
    }
}