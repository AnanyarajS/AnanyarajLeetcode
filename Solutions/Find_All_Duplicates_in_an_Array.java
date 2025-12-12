class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index]<0){
                list.add(index+1);
            }else{
                nums[index] = -nums[index];
            }
        }
        return list;

    }
}
/*class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)==2)
            list.add(key);
        }
        return list;
    }
}*/