class Solution {
    public String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(c==stack.peek()){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}