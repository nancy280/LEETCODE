class Solution {
    public int largestRectangleArea(int[] heights) {
        int leftsmall[] =new int[heights.length];
        int rightsmall[] =new int[heights.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            leftsmall[i]=st.isEmpty()?0:st.peek()+1;
            st.push(i);
        }
        st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            rightsmall[i]=st.isEmpty()?heights.length-1:st.peek()-1;
            st.push(i);
        }
        int max=0;
        int i=0;
        for(;i<heights.length;i++)
        {
            int area=heights[i]*(rightsmall[i]-leftsmall[i]+1);
            max=Math.max(max,area);
        }
        return max;
    }
}