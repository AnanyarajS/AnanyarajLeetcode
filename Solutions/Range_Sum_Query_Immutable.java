class NumArray {
    int [] nums;
    int [] sumarr;
    public NumArray(int[] nums) {
        this.nums = nums;
         sumarr = new int[nums.length];
        int sum = 0;;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        sumarr[i] = sum;
        
    }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return sumarr[right];
        return sumarr[right]-sumarr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */