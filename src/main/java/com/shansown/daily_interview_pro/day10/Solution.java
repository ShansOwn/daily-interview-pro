package com.shansown.daily_interview_pro.day10;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean check(int[] arr) {
    var modified = false;

    for (var i = 0; i < arr.length - 1; i++) {
      var prev = i == 0 ? Integer.MIN_VALUE : arr[i - 1];
      var curr = arr[i];
      var next = arr[i + 1];

      if (curr > next) { // modification required
        if (modified) {
          return false;
        }
        if (i == 0 || next >= prev) {
          arr[i] = next; // update current
        } else {
          arr[i + 1] = curr; // update next
        }
        modified = true;
      }
    }
    return true;
  }
}
