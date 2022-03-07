class Solution {
    public int maximumWealth(int[][] accounts) {
     int rowSum =0; int maxCurrency = 0;
        for(int i = 0; i <accounts.length;i++){
             rowSum =0;
          for(int j = 0; j <accounts[i].length;j++){
            rowSum += accounts[i][j];
        } 
            if(rowSum > maxCurrency)
                maxCurrency = rowSum;
        }
        return maxCurrency;
    }
}