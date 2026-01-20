class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        char [] a1 = s.toCharArray();
        char [] a2 = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if( j<t.length() && a1[i]==a2[j]){
                j++;
            }
        }
       return t.length()-j;
    }
}