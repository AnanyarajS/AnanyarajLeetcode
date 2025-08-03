class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C")){
                stack.pop();
                list.remove(list.size()-1);
            }
            else if(operations[i].equals("D")){
                int val = 2*stack.peek();
                stack.push(val);
                list.add(val);
            }
            else if(operations[i].equals("+")){
               stack.push(list.get(list.size()-1)+list.get(list.size()-2)); 
               list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
                list.add(Integer.parseInt(operations[i]));
                
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
          sum+=stack.pop();
        }
        return sum;
    }
}