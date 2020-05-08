package com.shansown.daily_interview_pro.day12;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day12.Solution.Node;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void invert() {
    //      a
    //   b      c
    // d   e  f
    final var left = new Node("b", new Node("d"), new Node("e"));
    final var right = new Node("c", new Node("f"), null);
    final var root = new Node("a", left, right);

    assertThat(root.print())
        .isEqualTo("abdecf");
    assertThat(solution.invert(root).print())
        .isEqualTo("acfbed");

    assertThat(solution.invert(new Node("a")).print())
        .isEqualTo("a");
  }

}
