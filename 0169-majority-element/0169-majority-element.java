class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int k=nums.length/2;
        for(int i:nums)
        {
            if(hm.containsKey(i)){
                if(hm.get(i)+1>k)
                {
                    return i;
                }
                hm.put(i, hm.get(i)+1);
            }
            else
            hm.put(i,1);
        }
        if(nums.length==1){
            return nums[0];
        }
        return 0;
    }
}