class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set <Integer> s1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        }
        Set<Integer> d1 = new HashSet<>(s1);
        d1.removeAll(s2);
        Set<Integer> d2 = new HashSet<>(s2);
        d2.removeAll(s1);
        List<List<Integer>> l1= new ArrayList<>();
        l1.add(new ArrayList<>(d1));
        l1.add(new ArrayList<>(d2));
        return l1;
        


    }
}