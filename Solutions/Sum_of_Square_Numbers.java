class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==1||c==0)
        return true;
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right){
           long sq = (long)left*left+(long)right*right;
           if(sq==c)
           return true;
           else if(sq>c)
           right--;
           else
           left++;
        }
        return false;
    }
}