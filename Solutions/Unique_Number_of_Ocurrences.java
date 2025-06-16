class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> freqmap = new HashMap<>();
       for(int i:arr){
        freqmap.put(i,freqmap.getOrDefault(i, 0)+1);
       }
       Set<Integer> s = new HashSet<>();
       for(int f:freqmap.values()){
        if(!s.add(f))
        return false;
       }
       return true;
      
    }
}