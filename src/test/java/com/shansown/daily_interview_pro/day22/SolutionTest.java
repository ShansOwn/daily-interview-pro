package com.shansown.daily_interview_pro.day22;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day22.Solution.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void intersection() {
    assertThat(solution.intersection(null, null))
        .isNull();
    assertThat(solution.intersection(null, new ListNode(2)))
        .isNull();
    assertThat(solution.intersection(new ListNode(2), null))
        .isNull();

    // 1 -> 2 -> |3| -> 4
    final var a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    // 3
    final var intersection = a.next.next;
    // 6 -> |3| -> 4
    final var b = new ListNode(6, intersection);
    assertThat(solution.intersection(a, b))
        .as("intersection at 3")
        .isEqualTo(intersection);

    // 5 -> 6
    final var c = new ListNode(5, new ListNode(6));
    assertThat(solution.intersection(a, c))
        .as("no intersection")
        .isNull();
  }
}
