class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]) min = nums[i];
            if(max<nums[i]) max = nums[i];
        }
        int r = 0;
        while(min!=0){
            r = max%min;
            max = min;
            min = r;
        }
        return max;
    }
}