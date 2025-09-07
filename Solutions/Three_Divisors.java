class Solution {
    public boolean isThree(int n) {
        if(n==1||n==2)
        return false;
        int k = 0;
        for(int i=1;i<=n;i++){
          if(n%i==0)
          k++;
        }
        return k==3?true: false;

    }
}