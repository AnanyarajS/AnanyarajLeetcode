class Solution {
    public int maxVowels(String s, int k) {
        char [] str = s.toCharArray();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(isVowel(str[i])) count++;
            max = count;
        }
        for(int i=k;i<str.length;i++){
            if(isVowel(str[i]) && !isVowel(str[i-k])) count++;
            else if(!isVowel(str[i]) && isVowel(str[i-k])) count--;
            max = Math.max(count, max);
        }
        return max;
    }
    static boolean isVowel(char c){
        return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}