class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new ArrayDeque<Integer>();
        int[] max=new int[nums.length-k+1];
        int i=0;
        while(i<nums.length)
        {
            while(!q.isEmpty() && q.peekFirst()<=i-k)
            {
                q.removeFirst();
            }
            while(!q.isEmpty()&& nums[q.peekLast()]<nums[i])
            {
                q.removeLast();
            }
            q.offerLast(i);
            if(i>=k-1)
            {
                max[i-k+1]=nums[q.peekFirst()];
            }
            i++;
        }
        return max;
    }
}