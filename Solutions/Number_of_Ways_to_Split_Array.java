class Solution {
    public int waysToSplitArray(int[] nums) {
       long leftsum = 0;
       long totalsum = 0;
       int count = 0;
       for(int i=0;i<nums.length;i++){
        totalsum+=nums[i];
       }
       for(int i=0;i<nums.length-1;i++){
        leftsum+=nums[i];
        totalsum-=nums[i];
        if(leftsum>=totalsum) count++;
       }
       return count;

    }
}