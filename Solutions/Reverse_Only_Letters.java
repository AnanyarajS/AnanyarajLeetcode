class Solution {
    public String reverseOnlyLetters(String s) {
        char [] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<right){
            if((ch[left]<65 || ch[left]>122)){
                left++;
                continue;
            }
            else if(ch[right]<65 || ch[right]>122){
                right--;
                continue;
            }
            else if(ch[left]>=91 && ch[left]<=96){
                left++;
                continue;
            }
            else if(ch[right]>=91 && ch[right]<=96){
                right--;
                continue;
            }
             else{
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
            }
        }
              String str = new String(ch);
        return str;
        }

    }
