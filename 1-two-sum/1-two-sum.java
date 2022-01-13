class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] res = new int[2];
        Map<Integer,Integer> data = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];

            if(data.containsKey(complement)){

                res[0] = i;
                res[1] =  data.get(complement);
                return res;
            }
            data.put(nums[i],i);
        }
        return res;
    }
}