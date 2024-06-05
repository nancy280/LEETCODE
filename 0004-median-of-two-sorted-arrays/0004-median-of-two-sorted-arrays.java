class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1=0;
        int num2=0;
        
        int m=nums1.length;
        int n=nums2.length;
        
        int i=0;
        int j=0;
        for(int x=0;x<=(m+n)/2;x++)
        {
            num2=num1;
            if(i<m && j<n)
            {
                if(nums1[i]<nums2[j])
                {
                    num1=nums1[i++];
                }
                else
                {
                    num1=nums2[j++];
                }
            }
            else if(i<m)
            {
                num1=nums1[i++];
            }
            else
            {
                num1=nums2[j++];
            }
        }
        if((m+n) % 2==0)
        {
            return ((double)num1+num2)/2;
        }
        return (double)num1;
    }
}