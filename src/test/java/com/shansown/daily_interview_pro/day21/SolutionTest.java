package com.shansown.daily_interview_pro.day21;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day21.Solution.DPSolution;
import com.shansown.daily_interview_pro.day21.Solution.DPSolutionSpaceOptimised;
import com.shansown.daily_interview_pro.day21.Solution.RecSolution;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final List<Solution> solutions = List.of(
      new RecSolution(),
      new DPSolution(),
      new DPSolutionSpaceOptimised());

  @Test
  void numWays() {
    solutions.forEach(solution -> {
      assertThat(solution.numWays(3, 2))
          .isEqualTo(3);
      assertThat(solution.numWays(7, 3))
          .isEqualTo(28);
    });
  }

}
