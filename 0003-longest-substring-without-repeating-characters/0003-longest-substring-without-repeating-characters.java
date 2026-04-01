class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(str.indexOf(s.charAt(i))==-1)
            {
                str+=s.charAt(i);
                max=Math.max(max,str.length());
            }
            else
            {
                max=Math.max(max,str.length());
                int indx=str.indexOf(s.charAt(i));
                str=str.substring(indx+1)+s.charAt(i);
                max=Math.max(max,str.length());
            }
        }
        max=Math.max(max,str.length());
        return max;
    }
}