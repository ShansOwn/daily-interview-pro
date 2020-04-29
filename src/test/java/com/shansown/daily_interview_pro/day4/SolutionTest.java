package com.shansown.daily_interview_pro.day4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void isValid() {
    assertThat(solution.isValid("")).isTrue();
    assertThat(solution.isValid("((()))")).isTrue();
    assertThat(solution.isValid("[()]{}")).isTrue();
    assertThat(solution.isValid("[()]{}")).isTrue();
    assertThat(solution.isValid("({[)]")).isFalse();
    assertThat(solution.isValid("(){[}]")).isFalse();
  }

}
