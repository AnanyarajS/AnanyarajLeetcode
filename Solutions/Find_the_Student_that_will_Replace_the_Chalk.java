// class Solution {
//     public int chalkReplacer(int[] chalk, int k) {
//         int i=0;
//         while(k>=chalk[i]){
//           k-=chalk[i];
//           i++;
//           if(i==chalk.length) i=0;
//         }
//         return i;
//     }
// }
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int c:chalk) sum+=c;
        k%=sum;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]) return i;
            k-=chalk[i];
        }
        return -1;
    }
}