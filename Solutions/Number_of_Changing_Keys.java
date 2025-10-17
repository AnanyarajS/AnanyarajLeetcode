class Solution {
    public int countKeyChanges(String s) {
        char [] ch = s.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i+1]!=ch[i]&&ch[i]-ch[i+1]!=-32&&ch[i]-ch[i+1]!=32) count++;
        }
        return count;
    }
}