class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j < mat[0].length;j++){
               if(mat[i][j] == 0){
                   queue.add(new int[]{i,j});
               } 
                else
                    mat[i][j] = -1;
            }
        }
    int [][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
     int length = 0;
      while(!queue.isEmpty()){
          int size = queue.size();
          length++;
          while(size-->0){
              int[] cell = queue.poll();
              for(int[] d : dir){
                  int r = cell[0]+d[0];
              int c = cell[1]+d[1];
              if(r < 0 || c < 0 || r == mat.length || c == mat[0].length || mat[r][c] != -1)
                  continue;
              mat[r][c] = length;
                  queue.add(new int[]{r,c});
              }
              
          }
       }
                            return mat;
    }
}