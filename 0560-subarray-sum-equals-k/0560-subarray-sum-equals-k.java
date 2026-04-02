class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int c=0;
      for(int i=0;i<nums.length;i++)
      {
        sum+=nums[i];
        nums[i]=sum;
      }  
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==k)
        c++;
        for( int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+k==nums[j])
            {
                c++;
            }
        }
      }
      return c;
    }
}