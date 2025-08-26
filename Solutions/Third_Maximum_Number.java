class Solution {
    public int thirdMax(int[] nums) {
     long max = (long)nums[0];
     long secmax = Long.MIN_VALUE;
     long thirdmax = Long.MIN_VALUE;
     for(int num: nums){
        if(max<=num){
            if(max==num) continue;
            thirdmax = secmax;
            secmax = max;
            max = num;
        }
        else if(num>=secmax){
            if(num==secmax) continue;
            thirdmax = secmax;
            secmax = num;
        }
        else if(num>=thirdmax){
            if(thirdmax == num) continue;
            thirdmax = num;
        }
     }
     if(thirdmax == Long.MIN_VALUE)
     return (int)max;
     return (int)thirdmax;

         
            }
}