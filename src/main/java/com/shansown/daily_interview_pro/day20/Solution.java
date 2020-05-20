package com.shansown.daily_interview_pro.day20;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int minSubArrayLen(int[] nums, int target) {
    var left = 0;
    var right = 0;
    var length = 0;
    var sum = nums[left];

    while (right < nums.length && left <= right) {
      if (sum < target) {
        if (++right < nums.length) {
          sum += nums[right];
        }
      } else {
        final var foundLength = right - left + 1;
        length = length == 0 ? foundLength : Math.min(length, foundLength);
        sum -= nums[left];
        left++;
      }
    }
    return length;
  }
}
