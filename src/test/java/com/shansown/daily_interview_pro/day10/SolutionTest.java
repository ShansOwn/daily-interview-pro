package com.shansown.daily_interview_pro.day10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void check() {
    assertThat(solution.check(new int[]{}))
        .isTrue();
    assertThat(solution.check(new int[]{1, 1, 1}))
        .isTrue();
    assertThat(solution.check(new int[]{1, 2, 3}))
        .isTrue();
    assertThat(solution.check(new int[]{1, 5, 3}))
        .isTrue();
    assertThat(solution.check(new int[]{3, 2, 1}))
        .isFalse();

    assertThat(solution.check(new int[]{13, 4, 7}))
        .isTrue();
    assertThat(solution.check(new int[]{5, 1, 3, 2, 5}))
        .isFalse();
  }
}
