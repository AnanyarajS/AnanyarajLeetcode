class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0)
        return new long[0];
        long i = num/3-1;
        long j = num/3;
        long k = num/3+1;
        long [] arr = new long[3];
        if(i+j+k==num){
            arr[0] = i;
            arr[1] = j;
            arr[2] = k;
        }
        return arr;
    }
}