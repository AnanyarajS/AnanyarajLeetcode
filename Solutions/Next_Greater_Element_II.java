class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int [] result = new int[nums.length];

        for(int i=2*nums.length-1;i>=0;i--){
            int j = i%nums.length;
            if(st.isEmpty()){
                result[j] = -1;
                st.push(nums[j]);
                continue;
            }
            while(!st.isEmpty() && st.peek()<=nums[j]) st.pop();
            if(st.isEmpty()){
                result[j] = -1;
            }else{
                result[j] = st.peek();
            }
            st.push(nums[j]);
        }
        
        return result;
    }
}