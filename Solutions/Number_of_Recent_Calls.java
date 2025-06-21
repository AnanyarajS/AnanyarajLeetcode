class RecentCounter {

Queue<Integer> q;
    public RecentCounter() {
        
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
    int count=0;
         q.add(t);
         for(int num:q){
            if(num>=t-3000 && num<=t){
                count++;
            }
         }
         return count;
        

    }
}
