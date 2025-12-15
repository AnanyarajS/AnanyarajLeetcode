class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int row = 0;
        int col = grid[0].length-1;
        int count = 0;
        while(row<n && col>=0){
            if(grid[row][col]<0){
                count+=(n-row); 
                col--;     
            }else{
                row++;
            }
        
        }
        return count;

    }
}
        // while(row<n && col>=0){
        //     if(grid[row][col]<0){
        //         col--;
        //         count++;
        //     }
        //     else{
        //         row++;
        //         col = grid[0].length-1;
        //     }  
        //     if(col==-1){
        //         row++;
        //         col = grid[0].length-1;
        //     }
        // }
        // return count;