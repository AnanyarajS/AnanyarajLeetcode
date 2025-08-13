class Solution {
    static int [] merge(int [] l1, int [] l2){
          int [] merged = new int [l1.length+l2.length];
          int i=0, j=0, k=0;
         while(i<l1.length && j<l2.length){
            if(l1[i]>l2[j]){
                merged[k]=l2[j];
                j++;
            }
            else{
                merged[k] = l1[i];
                i++;
            }
            k++;
         }
         while(i<l1.length) merged[k++] = l1[i++];
         while(j<l2.length)merged[k++] = l2[j++];

         return merged;
    }
    public int[] sortArray(int[] nums) {
        if(nums.length==1)
        return nums;
        int n = nums.length;
        int [] arr1 = new int[n/2];
        int [] arr2 = new int[n-n/2];
        for(int i=0;i<n;i++){
            if(i<n/2)
            arr1[i]=nums[i];
            else
            arr2[i-arr1.length]=nums[i];
        }
        int [] l1 = sortArray(arr1);
        int [] l2 = sortArray(arr2);
        
        return merge(l1, l2);
    }
}