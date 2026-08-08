class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countSub(nums, k)-countSub(nums, k-1);
    }
    public int countSub(int [] nums, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0, r = 0;
        int count = 0;
        while(r<nums.length){
            hm.put(nums[r], hm.getOrDefault(nums[r], 0)+1);
            while(hm.size()>k){
                hm.put(nums[l], hm.get(nums[l])-1);
                if(hm.get(nums[l])==0) hm.remove(nums[l]);
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}