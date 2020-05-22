package com.shansown.daily_interview_pro.day21;

import java.util.Arrays;

/**
 * @author yehor.lashkul
 */
public interface Solution {

  int numWays(int m, int n);

  class RecSolution implements Solution {

    public int numWays(int m, int n) {
      if (m == 1 || n == 1) {
        return 1;
      }
      return numWays(m - 1, n) + numWays(m, n - 1);
    }
  }

  class DPSolution implements Solution {

    public int numWays(int m, int n) {
      final int[][] grid = new int[m][n];

      for (var i = 0; i < m; i++) {
        for (var j = 0; j < n; j++) {
          grid[i][j] = 1;
          if (i > 0 && j > 0) {
            grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
          }
        }
      }
      return grid[m - 1][n - 1];
    }
  }

  class DPSolutionSpaceOptimised implements Solution {

    public int numWays(int m, int n) {
      int[] prev = new int[n];
      int[] curr = new int[n];
      int[] tmp;
      Arrays.fill(prev, 1);
      curr[0] = 1;

      for (var i = 1; i < m; i++) {
        for (var j = 1; j < n; j++) {
          curr[j] = prev[j] + curr[j - 1];
        }
        tmp = curr;
        curr = prev;
        prev = tmp;
      }
      return prev[n - 1];
    }
  }
}
