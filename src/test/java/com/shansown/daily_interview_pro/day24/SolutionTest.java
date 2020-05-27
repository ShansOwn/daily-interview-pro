package com.shansown.daily_interview_pro.day24;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day24.Solution.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void removeConsecutiveSumTo0() {
    assertThat(solution.removeConsecutiveSumTo0(new ListNode(1, new ListNode(-1))))
        .isEqualTo(null);

    // 1 -> 2 -> 3 -> -3 -> -2
    var input1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(-2)))));
    assertThat(solution.removeConsecutiveSumTo0(input1).print())
        .isEqualTo("1");

    // 1 -> 2 -> 3 -> -3 -> 4
    var input2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(4)))));
    assertThat(solution.removeConsecutiveSumTo0(input2).print())
        .isEqualTo("124");

    // -1 -> 1 -> 0 -> 1
    var input3 = new ListNode(-1, new ListNode(1, new ListNode(0, new ListNode(1))));
    assertThat(solution.removeConsecutiveSumTo0(input3).print())
        .isEqualTo("1");

    // 4 -> -3 -> -3 -> -3 -> 5 -> -1 -> -3 -> 1 -> 1 -> -1 -> 5]
    var input4 = new ListNode(4, new ListNode(-3, new ListNode(-3, new ListNode(-3, new ListNode(5,
        new ListNode(-1, new ListNode(-3, new ListNode(1, new ListNode(1, new ListNode(-1, new ListNode(5)))))))))));
    assertThat(solution.removeConsecutiveSumTo0(input4).print())
        .isEqualTo("-1-315");
  }

}
