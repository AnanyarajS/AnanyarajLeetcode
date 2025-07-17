class Solution {
    static void dfs(int [][]image, int i, int j, int color, int originalColor){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=originalColor) return;
        image[i][j]=color;
        dfs(image, i+1, j, color, originalColor);
        dfs(image, i-1, j, color, originalColor);
        dfs(image, i, j+1, color, originalColor);
        dfs(image, i, j-1, color, originalColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    if(image[sr][sc]==color)return image;
    int originalColor=image[sr][sc];
    dfs(image, sr, sc, color, originalColor);
    return image;

    }
}