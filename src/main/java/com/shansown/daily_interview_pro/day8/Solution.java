package com.shansown.daily_interview_pro.day8;

import java.util.HashSet;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean twoSum(int[] arr, int target) {
    final var set = new HashSet<Integer>();

    for (var curr : arr) {
      final var remainsToTarget = target - curr;
      if (set.contains(remainsToTarget)) {
        return true;
      }
      set.add(curr);
    }

    return false;
  }

}
