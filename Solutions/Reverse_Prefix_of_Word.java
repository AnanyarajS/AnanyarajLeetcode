class Solution {
    public String reversePrefix(String word, char ch) {
     Stack<Character> stack = new Stack<>();
     char[] arr = word.toCharArray();
     int idx = -1;
     for(int i=0;i<arr.length;i++){
        stack.push(arr[i]);
        if(arr[i]==ch){
            idx = i;
            break;
        }
     }
     if(idx==-1) return word;
     int i = 0;
     while(i<idx+1){
        arr[i++] = stack.pop();
     }
     String str = new String(arr);
     return str;

    }
} 
/* String Builder Technique
 class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder words = new StringBuilder();
        words.append(word);
        int idx = 0;
        int n = words.length();
        for(int i = 0  ; i<n ; i++ ){
            char x = words.charAt(i);
            if(x == ch){
                idx = i;
                break;
            }
        }

        if(idx == -1)return words.toString();

        char temp = ' ';
        for(int i = 0 ; i<=idx/2 ; i++){
            
            char left = words.charAt(i);
            char right = words.charAt(idx - i);

            words.setCharAt(i, right);
            words.setCharAt(idx - i, left);
        }
        return words.toString();
        
    }
}
 */