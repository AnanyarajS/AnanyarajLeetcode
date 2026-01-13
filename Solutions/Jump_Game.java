class Solution {
    public boolean canJump(int[] nums) {
        int a = nums[0];
        for(int i=1;i<nums.length;i++){
            if(a<=0) return false;
            if(nums[i]>=a){
                a=nums[i];
            }else
            a--;
        }
        return true;
    }
}