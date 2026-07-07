class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // char[] arr = s.toCharArray();

        // for (char c : arr){
        //     map.put(c, map.getOrDefault(c, 0)+1);
        // }
        // for (int i=0;i<arr.length;i++){
        //     int val = map.get(arr[i]);
        //     if(val==1) return i;
        // }
        // return -1;

    int [] freq = new int[26];
    for(char c: s.toCharArray()){
        freq[c-'a']++;
    }

    char [] arr = s.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(freq[arr[i]-'a']==1) return i;
    }
return -1;
    }
}