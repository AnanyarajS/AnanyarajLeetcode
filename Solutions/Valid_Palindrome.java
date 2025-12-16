class Solution {
    public boolean isPalindrome(String s) {
        char [] arr = s.toLowerCase().toCharArray();
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(!Character.isLetterOrDigit(arr[low])){
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[high])){
                high--;
                continue;
            }
            if(Character.isLetterOrDigit(arr[low]) && Character.isLetterOrDigit(arr[high])){
                if(arr[low]!=arr[high])
                return false;
                low++;
                high--;
            }


        }
        return true;
    }
}
    
