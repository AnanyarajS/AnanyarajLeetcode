class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        max = sum;
        for(int i=0;i<k;i++){
            sum-=cardPoints[k-i-1];
            sum+=cardPoints[cardPoints.length-i-1];
            max = Math.max(max, sum);
        }
        return max;

    }

}