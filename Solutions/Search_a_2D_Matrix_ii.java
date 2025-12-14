class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int row = 0;
        int col = matrix[0].length-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;

    }
}
    //My initial solution...
        // for(int i=0;i<matrix.length;i++){
        //     int low = 0;
        //     int high = matrix[i].length-1;
        //     while(low<=high){
        //         int mid = low+(high-low)/2;
        //         if(matrix[i][mid]==target)
        //         return true;
        //         if(matrix[i][mid]>target)
        //         high = mid-1;
        //         else low = mid+1;
        //     }
        // }
        //  return false; 


