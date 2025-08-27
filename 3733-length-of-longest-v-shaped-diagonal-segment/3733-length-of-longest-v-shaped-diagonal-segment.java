class Solution {
    static int[] d = {1, 1, -1, -1, 1};

    static boolean isOutSide(int i, int j, int n, int m) {
        return i < 0 || i >= n || j < 0 || j >= m;
    }

    public int lenOfVDiagonal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][4];
     
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if ((grid[i + 1][j + 1] ^ 2) == grid[i][j]) {
                    dp[i][j][0] = 1 + dp[i + 1][j + 1][0];
                }
            }
        
            for (int j = 1; j < m; j++) {
                if ((grid[i + 1][j - 1] ^ 2) == grid[i][j]) {
                    dp[i][j][1] = 1 + dp[i + 1][j - 1][1];
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if ((grid[i - 1][j - 1] ^ 2) == grid[i][j]) {
                    dp[i][j][2] = 1 + dp[i - 1][j - 1][2];
                }
            }
          
            for (int j = m - 2; j >= 0; j--) {
                if ((grid[i - 1][j + 1] ^ 2) == grid[i][j]) {
                    dp[i][j][3] = 1 + dp[i - 1][j + 1][3];
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, 1);

                    for (int dir = 0; dir < 4; dir++) {
                        int s = i + d[dir];
                        int t = j + d[dir + 1];
                        if (isOutSide(s, t, n, m) || grid[s][t] != 2) continue;

                        int newDir = (dir + 1) & 3;

                        for (int cnt = 1;
                             !isOutSide(s, t, n, m) && grid[s][t] == ((cnt & 1) << 1);
                             cnt++, s += d[dir], t += d[dir + 1]) {

                            ans = Math.max(ans, cnt + dp[s][t][newDir] + 1);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
