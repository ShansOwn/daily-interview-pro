package com.shansown.daily_interview_pro.day14;

/**
 * @author yehor.lashkul
 */
public abstract class Solution {

  abstract int staircase(int steps);

  /**
   * Not O(n) complexity but I like its shortness, let's leave it here
   */
  static class RecSolution extends Solution {

    int staircase(int steps) {
      if (steps <= 0) {
        throw new IllegalArgumentException("Number of steps should be positive");
      }
      if (steps == 1 || steps == 2) {
        return steps;
      }
      return staircase(steps - 1) + staircase(steps - 2);
    }
  }

  static class IterSolution extends Solution {

    int staircase(int steps) {
      if (steps <= 0) {
        throw new IllegalArgumentException("Number of steps should be positive");
      }
      if (steps == 1 || steps == 2) {
        return steps;
      }
      int prevPrev = 1;
      int prev = 2;
      int cur = 0;
      for (int i = 2; i < steps; i++) {
        cur = prev + prevPrev;
        prevPrev = prev;
        prev = cur;
      }
      return cur;
    }
  }
}
