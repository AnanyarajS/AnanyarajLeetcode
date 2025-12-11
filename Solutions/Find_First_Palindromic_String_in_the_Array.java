class Solution {
    static boolean isPal(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPal(words[i]))
            return words[i];
        }
        return "";

    }
}