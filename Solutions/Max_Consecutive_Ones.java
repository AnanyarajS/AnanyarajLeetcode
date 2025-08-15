class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
             list.add(count);
             count = 0;
          }
          else{
            count++;
          }
        if(i==nums.length-1){
               list.add(count);
            }
        }
        int max = list.get(0);
        for(int i:list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}