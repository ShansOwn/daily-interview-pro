package com.shansown.daily_interview_pro.day15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void findPythagoreanTriplets() {
    assertThat(solution.findPythagoreanTriplets(new int[] {3, 5, 12, 5, 20}))
        .isFalse();
    assertThat(solution.findPythagoreanTriplets(new int[] {3, 5, 12, 5, 13}))
        .isTrue();
  }

}
