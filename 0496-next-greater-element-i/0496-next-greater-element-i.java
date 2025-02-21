class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int x=0;x<nums1.length;x++)
        {
            int y=0;
            for(;y<nums2.length;y++)
            {
                if(nums1[x]==nums2[y])
                {
                    break;
                }
            }
            for(;y<nums2.length;y++)
            {
                if(nums1[x]<nums2[y])
                {
                    res[x]=nums2[y];
                    break;
                }
            }
            if(res[x]==0)
            {
                res[x]=-1;
            }
        }
        return res;
    }
}