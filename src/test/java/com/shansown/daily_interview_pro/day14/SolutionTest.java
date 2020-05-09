package com.shansown.daily_interview_pro.day14;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.shansown.daily_interview_pro.day14.Solution.IterSolution;
import com.shansown.daily_interview_pro.day14.Solution.RecSolution;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final List<Solution> solutions = List.of(new RecSolution(), new IterSolution());

  @Test
  void staircase() {
    solutions.forEach(solution -> {
      assertThatThrownBy(() -> solution.staircase(0))
          .isInstanceOf(IllegalArgumentException.class)
          .hasMessageContaining("should be positive");
      assertThat(solution.staircase(1))
          .isEqualTo(1);
      assertThat(solution.staircase(2))
          .isEqualTo(2);
      assertThat(solution.staircase(4))
          .isEqualTo(5);
      assertThat(solution.staircase(5))
          .isEqualTo(8);
    });
  }
}
