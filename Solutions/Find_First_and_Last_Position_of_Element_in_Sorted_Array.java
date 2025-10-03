class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int [] arr = new int[2];
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        arr[0] = first;
        arr[1] = last;
        return arr;
        
    }
    public static int findFirst(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
        public static int findLast(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
}