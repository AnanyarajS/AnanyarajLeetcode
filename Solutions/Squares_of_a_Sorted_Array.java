class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            nums[i] *=nums[i];
        }
        for(int i:nums)
        pq.add(i);
        for(int i=0;i<nums.length;i++){
            nums[i] = pq.poll();
        }
        return nums;
    }
}