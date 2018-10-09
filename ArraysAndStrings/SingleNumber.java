class Solution {
    public int singleNumber(int[] nums) {
        int startIndex=0;
        int compareIndex=1;
        boolean foundSameValue=false;
        
        while(startIndex < nums.length && compareIndex < nums.length) {
            if(nums[startIndex]==0) {
                startIndex++;
                compareIndex=(startIndex+1);
                continue;
            }
            else if(nums[compareIndex]==0) {
                compareIndex++;
                 continue;
            }
            if(nums[startIndex]!=nums[compareIndex]) {
                if(compareIndex==nums.length-1) {
                    return nums[startIndex];
                }
                compareIndex++;
              }
            else {
                nums[compareIndex]=0;
                startIndex++;
                compareIndex=(startIndex+1);
              }
        }
        if((startIndex < nums.length) && (nums[startIndex]!=0)) {
            return nums[startIndex];
        }
        return 0;
    }
}