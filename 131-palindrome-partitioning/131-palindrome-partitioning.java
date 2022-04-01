class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> res = new ArrayList();
        generatePallindrome(0,s,new  ArrayList(),res);
        return res;
    }
    void  generatePallindrome(int index, String s,List<String> curr,List<List<String>> res){
        if(s.length() == index)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = index; i <s.length();i++){
           
            if(isPallin(s,index,i)){
            curr.add(s.substring(index,i+1));
            generatePallindrome(i+1,s,curr,res);
            curr.remove(curr.size()-1);   
            }
            
        }
    }
    boolean isPallin(String temp,int i, int j){
        
        if(temp.length() == 1)
            return true;
       
        while(i < j){
            if(temp.charAt(i++) != temp.charAt(j--)){
                return false;
            }
        }
         return true;        
    }
}