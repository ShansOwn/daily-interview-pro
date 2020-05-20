package com.shansown.daily_interview_pro.day20;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void minSubArrayLen() {
    assertThat(solution.minSubArrayLen(new int[]{}, 7))
        .as("empty array")
        .isEqualTo(0);

    assertThat(solution.minSubArrayLen(new int[]{7, 3, 1, 2, 4, 3}, 7))
        .as("first element == target")
        .isEqualTo(1);

    assertThat(solution.minSubArrayLen(new int[]{1, 1, 1, 1, 1, 7}, 7))
        .as("last element == target, no sum in prior sub-array")
        .isEqualTo(1);

    assertThat(solution.minSubArrayLen(new int[]{1, 1, 1, 7, 1, 1}, 7))
        .as("middle element == target, no sum in prior sub-array")
        .isEqualTo(1);

    assertThat(solution.minSubArrayLen(new int[]{1, 1, 1, 1, 1, 1}, 7))
        .as("no sum in whole array")
        .isEqualTo(0);

    assertThat(solution.minSubArrayLen(new int[]{2, 3, 1, 2, 4, 3}, 7))
        .as("from example")
        .isEqualTo(2);
  }

}
