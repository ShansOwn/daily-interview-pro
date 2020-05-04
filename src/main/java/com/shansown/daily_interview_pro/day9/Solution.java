package com.shansown.daily_interview_pro.day9;

import java.util.Arrays;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int singleNumber(int[] arr) {
    Arrays.sort(arr);

    for (int curr = 0, next = 1; curr < arr.length; curr = curr + 2, next = next + 2) {
      if (next >= arr.length || arr[curr] != arr[next]) {
        return arr[curr];
      }
    }
    throw new IllegalArgumentException("Array is empty or doesn't contain a non-duplicate number");
  }
}
