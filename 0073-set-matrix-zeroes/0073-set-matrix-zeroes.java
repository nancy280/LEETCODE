class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;int rows=matrix.length,col=matrix[0].length;
        for(int x=0;x<rows;x++)
        {
            if(matrix[x][0]==0)col0=0;
            for(int y=1;y<col;y++)
            {
                if(matrix[x][y]==0)
                {
                    matrix[x][0]=matrix[0][y]=0;
                }
            }
        }
        for(int x=rows-1;x>=0;x--)
        {
            for(int y=col-1;y>=1;y--)
            {
                if(matrix[0][y]==0||matrix[x][0]==0)
                matrix[x][y]=0;
            }
            if(col0==0)matrix[x][0]=0;
        }
    }
}