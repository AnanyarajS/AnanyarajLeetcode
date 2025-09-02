class Solution {
    public int findNumbers(int[] nums) {
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           while(nums[i]>0){
            nums[i]/=10;
            arr[i]++;
           }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}