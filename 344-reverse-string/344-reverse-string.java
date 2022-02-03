class Solution {
    public void reverseString(char[] s) {
        s = swapChars(s,0,s.length-1);
        
    }
     public char[] swapChars(char[] s, int start, int end  ){
        if(start > end)
            return s;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return swapChars(s,start+1,end-1);
    }
}