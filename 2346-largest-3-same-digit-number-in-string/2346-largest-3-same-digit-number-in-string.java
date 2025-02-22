class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        for(int i=0;i<=num.length()-3;i++)
        {
            if(num.charAt(i)==num.charAt(i+2))
            {
                if(num.charAt(i+1)==num.charAt(i))
                {
                    System.out.println(i);
                    String s=num.substring(i,i+3);
                    int m=Integer.parseInt(s);
                    max=Math.max(m,max);
                }
                i=i+1;
            }
        }
        if(max!=-1)
        return max==0?"000":max+"";
        else
        return "";
    }
}