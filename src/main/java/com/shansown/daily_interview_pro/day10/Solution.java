package com.shansown.daily_interview_pro.day10;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean check(int[] arr) {
    var modified = false;

    for (var i = 0; i < arr.length - 1; i++) {
      var curr = arr[i];
      var next = arr[i + 1];

      if (curr > next) {
        var canBeModified = (i == 0 || arr[i -1] <= next) && !modified;
        if (!canBeModified) {
          return false;
        }
        modified = true;
      }
    }

    return true;
  }

}
