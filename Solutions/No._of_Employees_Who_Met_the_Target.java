class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int hrs: hours){
            if(hrs>=target) count++;
        }
        return count;
    }
}