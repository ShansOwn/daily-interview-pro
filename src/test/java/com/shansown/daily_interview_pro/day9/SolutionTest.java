package com.shansown.daily_interview_pro.day9;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void singleNumber() {
    assertThatThrownBy(() -> solution.singleNumber(new int[]{}))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("empty");

    assertThatThrownBy(() -> solution.singleNumber(new int[]{1, 1, 2, 2}))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("non-duplicate number");

    assertThat(solution.singleNumber(new int[]{5, 3, 2, 1, 1, 2, 3}))
        .isEqualTo(5);
    assertThat(solution.singleNumber(new int[]{3, 2, 1, 1, 2, 3, 5}))
        .isEqualTo(5);
    assertThat(solution.singleNumber(new int[]{4, 3, 2, 4, 1, 3, 2}))
        .isEqualTo(1);
  }

}
