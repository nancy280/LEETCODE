class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=Integer.MIN_VALUE;
        int c=0;
        int pos=0;
        for (int i:nums)
        {
            if(curr!=i)
            {
                curr=i;
                c++;
                nums[pos++]=curr;
            }
        }
        
        return c;
    }
}