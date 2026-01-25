class Solution {
    public String reversePrefix(String s, int k) {
        int i=0;
        int j = k-1;
        char [] arr = s.toCharArray();
        while(i<j){
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
        
    }
}