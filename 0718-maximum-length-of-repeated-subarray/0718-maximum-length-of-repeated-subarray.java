class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        int max=0;
        int i=1;
        int j=1;
        for(;i<dp.length;i++)
        {
            for(j=1;j<=nums2.length;j++)
            {
                if(nums1[i-1]==nums2[j-1]){
                dp[i][j]=1+dp[i-1][j-1];
                max=Math.max(max,dp[i][j]);
                }
          }
        }
        return max;
    }
}