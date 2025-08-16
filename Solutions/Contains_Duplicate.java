class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> ss = new HashSet<>();
        for(int i:nums){
            ss.add(i);
        }
        if(ss.size()<nums.length)
        return true;
        return false;
    }
}