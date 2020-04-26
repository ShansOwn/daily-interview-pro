package com.shansown.daily_interview_pro.day1;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day1.Solution.IterSolution;
import com.shansown.daily_interview_pro.day1.Solution.Node;
import com.shansown.daily_interview_pro.day1.Solution.RecSolution;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  final Collection<Solution> solutions = List.of(new IterSolution(), new RecSolution());

  @Test
  void addTwoNumbers_n2_null() {
    // (1 -> 2 -> 3) + null = (1 -> 2 -> 3)
    final var n1 = new Node(1, new Node(2, new Node(3)));
    solutions.forEach(solution -> {
      final var result = solution.addTwoNumbers(n1, null);
      assertThat(print(result)).isEqualTo("123");
    });
  }

  @Test
  void addTwoNumbers_n1_null() {
    // null + (1 -> 2 -> 3) = (1 -> 2 -> 3)
    final var n2 = new Node(1, new Node(2, new Node(3)));

    solutions.forEach(solution -> {
      final var result = solution.addTwoNumbers(null, n2);
      assertThat(print(result)).isEqualTo("123");
    });
  }

  @Test
  void addTwoNumbers_n2_less() {
    // (1 -> 2 -> 3) + (1 -> 2) = (2 -> 4 -> 3)
    final var n1 = new Node(1, new Node(2, new Node(3)));
    final var n2 = new Node(1, new Node(2));

    solutions.forEach(solution -> {
      final var result = solution.addTwoNumbers(n1, n2);
      assertThat(print(result)).isEqualTo("243");
    });
  }

  @Test
  void addTwoNumbers_n1_less() {
    // (1 -> 2) + (1 -> 2 -> 3) = (2 -> 4 -> 3)
    final var n1 = new Node(1, new Node(2));
    final var n2 = new Node(1, new Node(2, new Node(3)));

    solutions.forEach(solution -> {
      final var result = solution.addTwoNumbers(n1, n2);
      assertThat(print(result)).isEqualTo("243");
    });
  }

  @Test
  void addTwoNumbers() {
    // (2 -> 4 -> 3) + (5 -> 6 -> 4) = (7 -> 0 -> 8)
    final var n1 = new Node(2, new Node(4, new Node(3)));
    final var n2 = new Node(5, new Node(6, new Node(4)));

    solutions.forEach(solution -> {
      final var result = solution.addTwoNumbers(n1, n2);
      assertThat(print(result)).isEqualTo("708");
    });
  }

  private String print(Node node) {
    if (node == null) {
      return "null";
    }
    var printer = new StringBuilder();
    do {
      printer.append(node.value);
      node = node.next;
    } while (node != null);
    return printer.toString();
  }

}
