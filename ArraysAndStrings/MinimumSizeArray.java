class Solution {
    public int minSubArrayLen(int s, int[] nums) {
       int sum=0,len=0,min_len=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum=0;
            len=1;
            sum+=nums[i];
         for(int j=i+1;j<nums.length;j++) {
             sum+=nums[j];
             len++;
             if(sum >= s) {
                 min_len=Math.min(min_len,len);
                 break;
             }
          }   
        }
        return (min_len!=Integer.MAX_VALUE?min_len:0);
    }
}