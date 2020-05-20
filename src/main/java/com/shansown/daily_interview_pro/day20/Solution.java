package com.shansown.daily_interview_pro.day20;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int minSubArrayLen(int[] nums, int target) {
    var left = 0;
    var right = 0;
    var length = 0;
    var result = 0;
    var sum = 0;

    while (right < nums.length) {
      while (sum < target && right < nums.length) {
        sum += nums[right++];
        length++;
      }
      while (sum >= target && left < nums.length) {
        result = result == 0 ? length : Math.min(result, length);
        sum -= nums[left++];
        length--;
      }
    }
    return result;
  }
}
