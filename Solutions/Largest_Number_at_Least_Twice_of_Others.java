class Solution {
    public int dominantIndex(int[] nums) {
     int max = -1;
     int secmax = -1;
     int index = 0;
     for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
            secmax = max;
            max = nums[i];
            index = i;
        } else if(secmax<nums[i] && nums[i]<max ){
            secmax = nums[i];
        }
     }
     return secmax*2<=max? index:-1;
    }
}