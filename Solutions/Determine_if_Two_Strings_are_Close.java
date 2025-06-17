
import java.util.*;
class Solution {
    public boolean closeStrings(String word1, String word2) {
       if(word1.length()!=word2.length())return false;
       int [] freq1 = new int[26];
       int [] freq2 = new int [26];
       Set<Character> s1= new HashSet<>();
       Set<Character> s2= new HashSet<>();
       for(char c:word1.toCharArray()){
        freq1[c-'a']++;
        s1.add(c);
       }
       for(char c:word2.toCharArray()){
        freq2[c-'a']++;
        s2.add(c);
       }
       Arrays.sort(freq1);
       Arrays.sort(freq2);
       return s1.equals(s2) && Arrays.equals(freq1, freq2);
    }
}