class Solution {
    public int findPairs(int[] nums, int k) {
        int i=0,j=1,count=0;
        Arrays.sort(nums);

        while(j<nums.length){
            int diff = nums[j] - nums[i];

            if(diff == k){
                count++;
                i++;j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }else if(diff < k){
                j++;
            }else{
                i++;
                if( i == j) j++;
            }
        }

        return count;
    }
}