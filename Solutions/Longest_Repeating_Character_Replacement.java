class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int max = 0;
        int [] freq = new int[26];
        int maxfreq = 0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxfreq = Math.max(freq[s.charAt(r)-'A'], maxfreq);
            while((r-l+1-maxfreq) > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max = Math.max(r-l+1, max);
            r++;  
        }
        return max;
        
    }
}