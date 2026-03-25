class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[]=new int[2];
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num=grid[i][j];
                num=Math.abs(num);
                num--;
                if(grid[num/n][num%n]<0)
                {
                    res[0]=num+1;
                }
                else
                grid[num/n][num%n]=-1*grid[num/n][num%n];
            }
        }
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num=grid[i][j];
                if(num>0)
                {
                    res[1]=count;
                    return res;
                }
                count++;
            }
        }
        return res;
    }
}