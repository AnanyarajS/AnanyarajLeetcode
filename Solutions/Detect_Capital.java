class Solution {
    public boolean detectCapitalUse(String word) {
     char [] ch = word.toCharArray();
     if(ch.length==1)
     return true;
     if(ch[0]>=97 && ch[0]<=122){
        for(int i=1;i<ch.length;i++){
            if(ch[i]<=90 && ch[i]>=65){
                 return false;
            }
     }
     }
     else if(ch[0]>=65 && ch[0]<=90){
        if(ch[1]>=65 && ch[1]<=90){
            for(int i=2;i<ch.length;i++){
               if(ch[i]<=122 && ch[i]>=97){
                return false;
               }
            }
        }
        else if(ch[1]>=97 && ch[1]<=122){
            for(int i=2;i<ch.length;i++){
                if(ch[i]<=90 && ch[i]>=65)
                return false;
            }
        }
        
     }
     return true;
       
       
    }
}