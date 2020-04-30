package com.shansown.daily_interview_pro.day5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void getRange() {
    assertThat(solution.getRange(new int[]{}, 0)).containsExactly(-1, -1);
    assertThat(solution.getRange(new int[]{1, 2, 3}, 0)).containsExactly(-1, -1);
    assertThat(solution.getRange(new int[]{1, 2, 3}, 4)).containsExactly(-1, -1);
    assertThat(solution.getRange(new int[]{1, 2, 3}, 2)).containsExactly(1, 1);
    assertThat(solution.getRange(new int[]{1, 1, 1, 1, 1}, 1)).containsExactly(0, 4);
    assertThat(solution.getRange(new int[]{1, 3, 3, 5, 7, 8, 9, 9, 9, 15}, 9)).containsExactly(6, 8);
  }

}
