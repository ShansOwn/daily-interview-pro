package com.shansown.daily_interview_pro.day7;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void sortNums() {
    assertThat(solution.sortNums(new int[]{}))
        .isEmpty();
    assertThat(solution.sortNums(new int[]{2}))
        .containsExactly(2);
    assertThat(solution.sortNums(new int[]{2, 2, 2, 2, 2, 3, 1}))
        .containsExactly(1, 2, 2, 2, 2, 2, 3);
    assertThat(solution.sortNums(new int[]{3, 3, 2, 1, 3, 2, 1}))
        .containsExactly(1, 1, 2, 2, 3, 3, 3);

  }

}
