class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList();
        generateCombinations(0,candidates, new ArrayList(),res,target);
        return res;
    }
    void generateCombinations(int index, int[] candidates, List<Integer> curr, List<List<Integer>> res, int target){
        if(target == 0){
             res.add(new ArrayList(curr));
            return;
        }
        if(target < 0)
            return;
           
        for(int i = index; i < candidates.length;i++){
            if(i > index  && candidates[i-1] == candidates[i] )
                continue;
            curr.add(candidates[i]);
            generateCombinations(i+1, candidates,curr,res, target-candidates[i]);
            curr.remove(curr.size() - 1);
        }
        
    }
}