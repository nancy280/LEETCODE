class Solution {
    public String largestGoodInteger(String s) {
        int max = -1;
        for(int i=0; i+2<s.length(); i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
                max = Math.max(max, s.charAt(i) - '0');
            }
        }

        if(max == -1)   return "";

        if(max!=-1)
        return max+""+max+""+max;

        return "";
    }
}