class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            int sellprice=prices[i];
            max=Math.max(max, sellprice-buyprice);

            if(buyprice>prices[i])
            {
                buyprice=prices[i];
            }
        }
        return max;
    }
}