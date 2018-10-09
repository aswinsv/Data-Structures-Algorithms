class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1) {
            return 0;
        }
        int maxValue=Integer.MIN_VALUE,secondMaxValue=Integer.MIN_VALUE;
        int maxIndex=-1, secondIndex=-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= maxValue) {
                if(i!=0) {
                    secondMaxValue=maxValue;
                    secondIndex=maxIndex;
                }
                maxIndex=i;
                maxValue=nums[i]
            }
            else if(nums[i] > secondMaxValue) {
                 secondMaxValue=nums[i];
                 secondIndex=i;
            }
        }
        return (nums[secondIndex]*2 <= nums[maxIndex] ? maxIndex:-1);
    }
}