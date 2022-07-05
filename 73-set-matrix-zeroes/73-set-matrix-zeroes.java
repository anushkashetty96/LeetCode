class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> col = new ArrayList<>();
            List<Integer> row = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0)
                {
                row.add(i);
                    col.add(j);
                }
            }
        }
        for( int k = 0; k <matrix.length; k++){
            for( int l = 0; l <matrix[0].length; l++){
               if(row.contains(k) || col.contains(l))
                    matrix[k][l] = 0;
                            }
        } 
    }
}