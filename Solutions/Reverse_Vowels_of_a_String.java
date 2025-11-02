class Solution {
    public String reverseVowels(String s) {
        char [] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        while(left<right){
            if(check(str[left]) & check(str[right])){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }else if(!(check(str[left]))){
                left++;

            }else if(!check(str[right])){
                right--;
            }
           
        }   
         return new String(str);     
    }
    static boolean check(char c){
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U') return true;
        return false;
    }
}