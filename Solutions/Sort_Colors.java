class Solution {
    public void sortColors(int[] nums) {
      int r = 0;
      int g = 0;
      int b = 0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0)r++;
        if(nums[i]==1)g++;
        if(nums[i]==2)b++;
      }
      for(int i=0;i<r;i++){
        nums[i]=0;
      }
      for(int i=r;i<g+r;i++){
        nums[i]=1;
      }
      for(int i=g+r;i<b+g+r;i++){
        nums[i]=2;
      }

    }
}