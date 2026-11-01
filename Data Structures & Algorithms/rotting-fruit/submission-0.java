class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i,j});
                } else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        int time = 0;

        while(!queue.isEmpty() && fresh > 0) {
            int size = queue.size();

            for(int i=0; i<size;i++) {
            int[] current = queue.poll();
            for(int k=0;k<4;k++) {
                int nx = current[0] + dx[k];
                int ny = current[1] + dy[k];
                if(nx >= 0 && ny >= 0 && nx < m && ny < n 
                    && grid[nx][ny] == 1) {

                        grid[nx][ny] = 2;
                        fresh--;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            time++;
        }

return fresh == 0 ? time : -1;
    }
}
