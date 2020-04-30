package com.shansown.daily_interview_pro.day5;

import java.util.Arrays;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int[] getRange(int[] arr, int target) {
    var index = findTargetIndex(arr, target);
    if (index < 0) {
      return new int[]{-1, -1};
    }

    var leftIndex = index;
    var rightIndex = index;

    while (leftIndex >= 0 && target == arr[leftIndex]) {
      leftIndex--;
    }
    while (rightIndex < arr.length && target == arr[rightIndex]) {
      rightIndex++;
    }

    return new int[]{leftIndex + 1, rightIndex - 1};
  }

  private int findTargetIndex(int[] arr, int target) {
    return Arrays.binarySearch(arr, target);
  }
}
