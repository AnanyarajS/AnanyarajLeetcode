class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        double avg = Double.MAX_VALUE;
        while(low<high){
            double curr = ((double)nums[low]+(double)nums[high]);
            avg = Math.min(avg, curr);
            low++;
            high--;
        }

        return avg/2;
    }
}