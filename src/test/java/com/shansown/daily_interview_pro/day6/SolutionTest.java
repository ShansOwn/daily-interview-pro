package com.shansown.daily_interview_pro.day6;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day6.Solution.IterSolution;
import com.shansown.daily_interview_pro.day6.Solution.Node;
import com.shansown.daily_interview_pro.day6.Solution.RecSolution;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Set<Solution> solutions = Set.of(new IterSolution(), new RecSolution());

  @Test
  void reverse() {
    solutions.forEach(solution -> {
      assertThat(solution.reverse(new Node(0)))
          .returns("0", Node::print);

      // 4 -> 3 -> 2 -> 1 -> 0
      final var original = new Node(4, new Node(3, new Node(2, new Node(1, new Node(0)))));
      assertThat(original.print())
          .as("print works correct")
          .isEqualTo("43210");

      assertThat(solution.reverse(original))
          .as("correctly reversed")
          .returns("01234", Node::print);
    });
  }

}
