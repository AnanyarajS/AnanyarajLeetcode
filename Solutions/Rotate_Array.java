class Solution {
    public void rotate(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        int n = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, n-1);
        reverse(nums, n, nums.length-1);
    }
    void reverse(int[] nums, int low, int high){
        while(high>low){
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
            low++;
            high--;
        }
    }

}