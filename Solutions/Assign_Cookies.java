class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length==0) return 0;
        int n = g.length-1;
        int m = s.length-1;
        for(int i=n;i>=0;i--){
            if(g[i]<=s[m]){
                count++;
                m--;
            }
            if(m==-1) break;
        }
        return count;        
    }
}