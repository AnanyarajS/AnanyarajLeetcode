class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] merged = new char[w1.length+w2.length];
        int left = 0;
        int right = 0;  
        int i = 0;
        while(left<w1.length && right<w2.length){
           merged[i] = w1[left];
           left++;
           i++;
           merged[i] = w2[right];
           right++;
           i++;
        }
        while(left<w1.length){
                  merged[i] = w1[left];
                  i++;
                  left++;
            
        }
        while(right<w2.length){
                merged[i] = w2[right];
                i++;
                right++;  
        }
        String str = new String(merged);
        return str;
    }
}