class Solution {
    public int pivotIndex(int[] nums) {
        int left =0;
        int right=0;
        for(int i=1;i<nums.length;i++)
        {
            right+=nums[i];
        }
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(left==right)
            {
                return i;
            }
            else
            {
                if(i!=nums.length-1)
                right-=nums[i+1];
                left+=nums[i];
            }
        }
        return -1;
    }
}