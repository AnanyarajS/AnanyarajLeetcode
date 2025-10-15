class Solution {
    public int findComplement(int num) {
        int n = num;
        int count = 0;
        while(n!=0){
          n/=2;
          count++;
        }
        int k = 0;
        for(int i=0;i<count;i++){
            k = k+(int)Math.pow(2, i);
        }
        return k^num;
    }
}