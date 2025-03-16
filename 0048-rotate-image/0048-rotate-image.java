class Solution {
    public void rotate(int[][] ar) {
        int n=ar.length;
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                int t=ar[i][j];
                ar[i][j]=ar[n-1-i][j];
                ar[n-1-i][j]=t;
            }
        }
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                int t=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=t;
            }
        }
    }
}
