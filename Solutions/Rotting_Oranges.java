class Solution {
    public int orangesRotting(int[][] grid) {

        if (grid.length == 0) return 0;

        Queue<int[]> q = new LinkedList<>();

        int total = 0;
        int count = 0;
        int time = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] != 0)
                    total++;

                if (grid[i][j] == 2)
                    q.offer(new int[]{i, j});
            }
        }

        int m = grid.length;
        int n = grid[0].length;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!q.isEmpty()) {

            int size = q.size();
            count += size;

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int x = curr[0];
                int y = curr[1];

                for (int j = 0; j < 4; j++) {

                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] != 1)
                        continue;

                    grid[nx][ny] = 2;
                    q.offer(new int[]{nx, ny});
                }
            }

            if (!q.isEmpty())
                time++;
        }

        return count == total ? time : -1;
    }
}