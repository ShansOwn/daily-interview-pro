package com.shansown.daily_interview_pro.day2;

import java.util.HashSet;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int lengthOfLongestSubstring(String str) {
    if (str == null || str.isEmpty()) {
      return 0;
    }

    final var chars = str.split("");
    final var substrSet = new HashSet<String>();
    var num = 0;
    var result = 0;

    for (String ch : chars) {
      if (substrSet.add(ch)) {
        num ++;
      } else {
        substrSet.clear();
        result = Math.max(result, num);
        num = 0;
      }
    }

    return Math.max(num, result);
  }
}
