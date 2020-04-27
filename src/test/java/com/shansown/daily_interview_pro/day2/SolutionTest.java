package com.shansown.daily_interview_pro.day2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void lengthOfLongestSubstring() {
    assertThat(solution.lengthOfLongestSubstring(null)).isEqualTo(0);
    assertThat(solution.lengthOfLongestSubstring("")).isEqualTo(0);
    assertThat(solution.lengthOfLongestSubstring("abcdefghij")).isEqualTo(10);
    assertThat(solution.lengthOfLongestSubstring("aaaaaaaaaa")).isEqualTo(1);
    assertThat(solution.lengthOfLongestSubstring("abrkaabcdefghijjxxx")).isEqualTo(10);
  }

}
