class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        while(i<sa.length && j<ta.length){
            if(sa[i]!=ta[j]){
                j++;
            }else{
            j++;
            i++;
            }
        }
        return i==sa.length;

    }
}