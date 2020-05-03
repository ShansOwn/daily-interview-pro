package com.shansown.daily_interview_pro.day8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void twoSum() {
    assertThat(solution.twoSum(new int[]{}, 3))
        .isFalse();
    assertThat(solution.twoSum(new int[]{1, 3, 5}, 3))
        .isFalse();
    // 3 + 0 = 3
    assertThat(solution.twoSum(new int[]{1, 3, 5, 0}, 3))
        .isTrue();
    // 10 + (-7) = 5
    assertThat(solution.twoSum(new int[]{10, 7, 1, -7, -10}, 3))
        .isTrue();
    // 4 + 1 = 5
    assertThat(solution.twoSum(new int[]{4, 7, 1, -3, 2}, 5))
        .isTrue();
  }
}
