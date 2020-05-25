package com.shansown.daily_interview_pro.day23;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void pushDominoes() {
    assertThat(solution.pushDominoes("......"))
        .isEqualTo("......");
    assertThat(solution.pushDominoes(".....L"))
        .isEqualTo("LLLLLL");
    assertThat(solution.pushDominoes("R....."))
        .isEqualTo("RRRRRR");
    assertThat(solution.pushDominoes("R.R.L"))
        .isEqualTo("RRR.L");
    assertThat(solution.pushDominoes(".L.R...LR..L.."))
        .isEqualTo("LL.RR.LLRRLL..");
    assertThat(solution.pushDominoes("RR.L"))
        .isEqualTo("RR.L");
  }
}
