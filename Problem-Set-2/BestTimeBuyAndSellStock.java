class Solution {
    public int maxProfit(int[] prices) {
        int prevIndex=0,nextIndex=1;
        int totalProfit=0;
        int currentProfit=0;    
        while((prevIndex < prices.length) && (nextIndex< prices.length)) {
            if(prices[prevIndex] >= prices[nextIndex] ) {
                prevIndex++;
                nextIndex++;
            }
            else if(prices[prevIndex] < prices[nextIndex] && ((nextIndex+1 < prices.length && prices[nextIndex]>prices[nextIndex+1]) || nextIndex==prices.length-1)) {
                totalProfit=totalProfit+(prices[nextIndex]-prices[prevIndex]);
                prevIndex=nextIndex;
                nextIndex++;
            }
         else {
                nextIndex++;
            }
        }
        return totalProfit;
    }
}