class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int n = Math.abs(num);
        while(n>0){
            int rd = n%7;
            n/=7;
            sb.append((char)('0'+rd));
        }
        if(num<0) sb.append('-');
        return sb.reverse().toString();
    }
}