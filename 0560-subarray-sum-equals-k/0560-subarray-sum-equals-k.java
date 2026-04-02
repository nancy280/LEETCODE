class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int c = 0;

        if(nums.length == 1 && nums[0] != k)
            return 0;
        else if(nums.length == 1 && nums[0] == k)
            return 1;

        ArrayList<Integer> hm = new ArrayList<>();

        // prefix sum array (same as yours)
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            hm.add(sum);
        }

        // NEW: frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            // case 1: subarray from index 0
            if(hm.get(i) == k)
                c++;

            // case 2: check previous prefix sums
            int need = hm.get(i) - k;
            if(map.containsKey(need)) {
                c += map.get(need);
            }

            // update map
            map.put(hm.get(i), map.getOrDefault(hm.get(i), 0) + 1);
        }

        return c;
    }
}