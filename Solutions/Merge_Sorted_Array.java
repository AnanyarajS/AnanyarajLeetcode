class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //  PriorityQueue<Integer> pq = new PriorityQueue<>();
        //  for(int i=0;i<m;i++){
        //     pq.add(nums1[i]);
        //  }  
        //  for(int i=0;i<n;i++){
        //     pq.add(nums2[i]);
        //  }
        //  for(int i=0;i<nums1.length;i++){
        //     nums1[i] = pq.poll();
        //  }
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
           nums1[k] = nums2[j];
           k--;
           j--;
        }
         
    }
}