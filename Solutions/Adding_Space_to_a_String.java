class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        for(j=0;j<s.length() && i<spaces.length;j++){
            if(j==spaces[i]){
                sb.append(' ');
                j--;
                i++;
                continue;
            }
            sb.append(s.charAt(j));
        }
        while(j<s.length()){
            sb.append(s.charAt(j));
            j++;
        }

        return sb.toString();
    }
}