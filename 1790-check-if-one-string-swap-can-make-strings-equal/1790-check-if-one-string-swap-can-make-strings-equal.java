class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
          List<Integer> unequalCharPos = new ArrayList<>();
        if(s1.equals(s2))
            return true;
        for(int i =0; i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i))
            {
                unequalCharPos.add(i);
            }
        }
        if(unequalCharPos.size() != 2){
            return false;
        }
        else{
            if((s1.charAt(unequalCharPos.get(0))== s2.charAt(unequalCharPos.get(1))) && (s1.charAt(unequalCharPos.get(1))== s2.charAt(unequalCharPos.get(0))) )
                return true;
            
        }
        return false;
        
    }
}