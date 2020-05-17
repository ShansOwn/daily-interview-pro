package com.shansown.daily_interview_pro.day18;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void findCycle() {
    //          0
    //        / | \
    //      a   b   c
    //     /\   |
    //    a2 a3 b2
    Map<String, Set<String>> nonCyclicGraph = Map.of(
        "0", Set.of("a", "b", "c"),
        "a", Set.of("0", "a2", "a3"),
        "a2", Set.of("a"),
        "a3", Set.of("a"),
        "b", Set.of("0", "b2"),
        "b2", Set.of("b"),
        "c", Set.of("0")
    );
    assertThat(solution.findCycle(nonCyclicGraph)).isFalse();

    //          0
    //        / | \
    //      a   b   c
    //     /\   |  /
    //    a2 a3 b2
    Map<String, Set<String>> cyclicGraph = Map.of(
        "0", Set.of("a", "b", "c"),
        "a", Set.of("0", "a2", "a3"),
        "a2", Set.of("a"),
        "a3", Set.of("a"),
        "b", Set.of("0", "b2"),
        "b2", Set.of("b"),
        "c", Set.of("0", "b2")
    );
    assertThat(solution.findCycle(cyclicGraph)).isTrue();
  }
}
