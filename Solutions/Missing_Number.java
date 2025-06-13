import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int realsum=n*(n+1)/2;
        for(int i=0;i<n;i++){
          sum+=nums[i];
        }
        return realsum-sum;
      
    }
    
}