class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> hm = new HashMap<>();
         for(int num:nums){
           hm.put(num, hm.getOrDefault(num, 0)+1); 
         }
         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
         pq.addAll(hm.entrySet());
         int [] arr = new int[k];
         for(int i=0;i<k;i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            arr[i] = entry.getKey();
         }
         return arr;
    }
}