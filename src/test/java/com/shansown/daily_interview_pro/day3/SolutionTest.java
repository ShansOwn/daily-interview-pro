package com.shansown.daily_interview_pro.day3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void longestPalindrome() {
    assertThat(solution.longestPalindrome(null))
        .isEqualTo("");

    assertThat(solution.longestPalindrome(""))
        .isEqualTo("");

    assertThat(solution.longestPalindrome("abcdefg"))
        .isEqualTo("a");

    assertThat(solution.longestPalindrome("banana"))
        .isEqualTo("anana");

    assertThat(solution.longestPalindrome("million"))
        .isEqualTo("illi");

    assertThat(solution.longestPalindrome("tracecars"))
        .isEqualTo("racecar");

    assertThat(solution.longestPalindrome("abacdeed"))
        .isEqualTo("deed");

    assertThat(solution.longestPalindrome("abbacded"))
        .isEqualTo("abba");
  }
}
