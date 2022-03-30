class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList();
        generateCombinations(1,9,new ArrayList(),res,k,n);
        return res;
    }
    
    void generateCombinations(int index, int n, List<Integer> curr, List<List<Integer>> res, int k,int target){
        if(target == 0 && curr.size() == k){
          res.add(new ArrayList(curr)); 
            return;
        }
     
        for(int i = index; i<=n; i++){
            curr.add(i);
            generateCombinations(i+1,n,curr,res,k,target-i);
            curr.remove(curr.size()-1);            
        }
    }
}