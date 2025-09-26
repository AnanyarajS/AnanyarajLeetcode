class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int [] arr = new int[2];
        while(left<right){
            int n = numbers[left]+numbers[right];
            if(n==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }
            else if(n>target) right--;
            else left++;
        }
        return arr;
    }
}