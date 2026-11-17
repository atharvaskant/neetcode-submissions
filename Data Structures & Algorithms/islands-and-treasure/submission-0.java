class Solution {
    public void islandsAndTreasure(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 0)
                    q.add(new int[]{i,j});

                }
            }

        while(!q.isEmpty()) {

            int[] current = q.poll();

            int x = current[0];
            int y = current[1];



            for(int i=0;i<4;i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= m || ny<0 || ny>=n || grid[nx][ny] == -1 || grid[nx][ny] != 2147483647) {
                    continue;
                }

                q.add(new int[]{nx, ny});
                grid[nx][ny] = grid[x][y]+1;

            }
        }
    }
}
