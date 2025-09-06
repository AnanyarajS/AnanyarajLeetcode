class Solution {
    public int arraySign(int[] nums) {
        int p = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) p*=-1;
            if(nums[i]==0) return 0;
        }
        return p;
    }
}