class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
       
    }
    public int atMost(int [] nums, int k){
        if(k<0) return 0;
        int r = 0, l = 0;
       int count = 0;
       int arrCount = 0;
       while(r<nums.length){
        if(nums[r]%2!=0) count++;
        while(count>k && l<=r){
            if(nums[l]%2!=0) count--;
            l++;
        }
        arrCount+=(r-l+1);
        r++;
       }
       return arrCount;
    }
}