class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> ts = new Stack<>();
        boolean flag = true;
        for(char c: s.toCharArray()){
            if(c=='#'){
                if(ss.isEmpty())
                continue;
                else
                ss.pop();
            }
    
            else
            ss.push(c);
        }
            for(char c: t.toCharArray()){
            if(c=='#'){
                if(ts.isEmpty())
                continue;
                else
                ts.pop();
            }
            else
            ts.push(c);
        }
        while(!ss.isEmpty() && !ts.isEmpty()){
            if(ss.pop()!=ts.pop())
            return false;
        }
        return ss.isEmpty() && ts.isEmpty();

    }
}