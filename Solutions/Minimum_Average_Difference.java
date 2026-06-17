class Solution {
    public int minimumAverageDifference(int[] nums) {
       long leftSum = 0;
       long totalSum = 0;
       for(int i=0;i<nums.length;i++){
        totalSum+=nums[i];
       }
       long diff = Long.MAX_VALUE;
       int idx = 0;
       for(int i=0;i<nums.length-1;i++){
        leftSum+=nums[i];
        totalSum-=nums[i];
        if(diff>Math.abs(leftSum/(i+1)-totalSum/(nums.length-i-1))){
            diff = Math.abs(leftSum/(i+1)-totalSum/(nums.length-i-1));
            idx = i;
        }
       }
       leftSum+=nums[nums.length-1];
       if(diff>Math.abs(leftSum/nums.length)) return nums.length-1;
       return idx;

    }
}