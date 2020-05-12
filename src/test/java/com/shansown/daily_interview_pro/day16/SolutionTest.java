package com.shansown.daily_interview_pro.day16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void distance() {
    assertThat(solution.distance("", "sitting"))
        .isEqualTo(7);
    assertThat(solution.distance("biting", ""))
        .isEqualTo(6);
    assertThat(solution.distance("biting", "sitting"))
        .isEqualTo(2);
  }
}
