class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int largest = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(grid, i, j, m, n);
                    largest = Math.max(largest, area);
                }
            }
        }
        return largest;
    }

    int dfs(int[][] grid, int x, int y, int m, int n) {
        if(x < 0 || y < 0 || x >=m || y >= n || grid[x][y] == 0) {
            return 0;
        }

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        int area = 1;

        grid[x][y] = 0; // visited

        for(int k=0;k<4;k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            area = area + dfs(grid, nx, ny, m, n);

        }

        return area;
    }
}
