package com.shansown.daily_interview_pro.day17;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void eval() {
    assertThat(solution.eval("2 - 1")).isEqualTo(1);
    assertThat(solution.eval("- (3 + ( 2 - 1 ) )")).isEqualTo(-4);
    assertThat(solution.eval("(1 + 2) - (-3 + (2 - 1))")).isEqualTo(5);
  }
}
