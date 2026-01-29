class Solution {
    public int[] shortestToChar(String s, char c){
        int n = s.length();
        int [] arr = new int[n];
        int right = 2*n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                right = i;
            }
            arr[i] = right-i;
        }

        int left = -n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                left = i;
            }
            arr[i] = Math.min(arr[i], i-left);
        }
return arr;
    }
}

//MY ORIGINAL CODE: SHOWING 3MS RUNTIME
// class Solution {
//     public int[] shortestToChar(String s, char c) {
//         int i = 0;
//         int right = 0;
//         int left = 0;
//         char [] str = s.toCharArray();
//         int [] arr = new int[str.length];
//         while(i<str.length){
//             if(right==str.length)right--;
//             if(left==-1)left++;
//             if(str[right]==c){
//                 arr[i] = right-i;
//                 i++;
//                 right = i;
//                 left = i;
//                 continue;            
//             }if(str[left]==c){
//                 arr[i] = i-left;
//                 i++;
//                 right=i;
//                 left = i;
//                 continue;
//             } 
//             left--;
//             right++;
//         }
//         return arr;
//     }
// }