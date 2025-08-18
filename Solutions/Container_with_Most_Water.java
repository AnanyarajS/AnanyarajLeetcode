class Solution {
    public int maxArea(int[] height) {
     int left = 0;
     int right = height.length-1;
     int max = 0;
     while(right>left){
      int area = Math.min(height[left], height[right])*(right-left);
      max = Math.max(area, max);
      if(height[right]>height[left]){
        left++;
      }
      else
      right--;
     }
        return max;
    }
}