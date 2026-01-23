class Solution {
    public int lengthOfLongestSubstring(String s) { 
        if(s.length()==0 || s.length()==1) return s.length();
        int left = 0;
        int right = 0;
        int maxCount = 0;
        int [] visited = new int[256];
        Arrays.fill(visited, -1);
        while(right<s.length()){
            while(visited[s.charAt(right)]!=-1 && left<=right){
                visited[s.charAt(left)] = -1;
                left++;
            }
             visited[s.charAt(right)] = 1;
            maxCount = Math.max(right-left+1, maxCount);
            right++;           
        }
        return maxCount;
    }
}