package com.shansown.daily_interview_pro.day3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author yehor.lashkul
 */
public class Solution {

  String longestPalindrome(String str) {
    if (str == null || str.isEmpty()) {
      return "";
    }

    var leftResult = 0;
    var rightResult = 0;
    var chars = str.split("");

    for (var left = 0; left < chars.length; left++) {
      for (var right = chars.length - 1; right > left; right--) {
        if (isPalindrome(chars, left, right)
            && (right - left) > (rightResult - leftResult)) {
          leftResult = left;
          rightResult = right;
        }
      }
    }

    return Arrays.stream(chars, leftResult, rightResult + 1)
        .collect(Collectors.joining());
  }

  private boolean isPalindrome(String[] chars, int start, int end) {
    for (int left = start, right = end; left < right; left++, right--) {
      var leftChar = chars[left];
      var rightChar = chars[right];
      if (!leftChar.equals(rightChar)) {
        return false;
      }
    }
    return true;
  }
}
