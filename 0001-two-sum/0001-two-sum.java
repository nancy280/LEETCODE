class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int i = 0;i<nums.length;i++)
        {
            if(ar.contains(target - nums[i]))
            {
                int[] res= new int[2];
                res[0]=ar.indexOf(target - nums[i]);
                res[1]= i;
                return res;
            }
            else
                ar.add(nums[i]);
        }
        return new int[2];
    }
}