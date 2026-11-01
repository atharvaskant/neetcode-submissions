class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid,i,j,m,n);
                }
            }
        }

        return count;
        
    }

    void dfs(char[][] grid, int x, int y, int m, int n) {

            if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == '0') {
                return;
            }

            grid[x][y] = '0';

            dfs(grid, x-1, y, m, n);
            dfs(grid, x+1, y, m, n);
            dfs(grid, x, y-1, m, n);
            dfs(grid, x, y+1, m, n);

        }





}
