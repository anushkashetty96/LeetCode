class Solution {
  public int[] sortedSquares(int[] n) {
int k=n.length;
for(int i=0;i<k;i++)
{
n[i]=n[i]*n[i];
}
Arrays.sort(n);
return n;
}
}