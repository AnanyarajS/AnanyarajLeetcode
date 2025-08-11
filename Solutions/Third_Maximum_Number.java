class Solution {
    public int thirdMax(int[] nums) {
        SortedSet<Integer> ss = new TreeSet<>();
        for(int n:nums){
            ss.add(n);
        }
        List <Integer> list = new ArrayList<>(ss);
        if(list.size()<3)
        return list.get(list.size()-1);
        return list.get(list.size()-3);
            }
}