package com.shansown.daily_interview_pro.day15;

import java.util.Arrays;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean findPythagoreanTriplets(int[] arr) {
    for (var i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * arr[i];
    }

    Arrays.sort(arr);

    for (var i = arr.length - 1; i > 1; i--) {
      var left = 0;
      var right = i - 1;
      while (left < right) {
        var sum = arr[left] + arr[right];
        if (sum == arr[i]) {
          return true;
        }
        if (sum > arr[i]) {
          right--;
        }
        if (sum < arr[i]) {
          left++;
        }
      }
    }
    return false;
  }

}
