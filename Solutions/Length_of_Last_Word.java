class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        char[] str = s.toCharArray();
        int endspace=0;
        for(int i = str.length-1;i>=-1;i--){
            if(str[i]!=' '){
                endspace=str.length-i-1;
                break;
            }
        
        }  
            
        for(int i=str.length-1;i>=0;i--){
           if(str[i]!=' ' && (i==0||str[i-1]==' ')){
            count=str.length-i-endspace;
            break;
           }
            
        }
        return count;
    }
}