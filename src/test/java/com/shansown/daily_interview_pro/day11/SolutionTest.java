package com.shansown.daily_interview_pro.day11;

import static org.assertj.core.api.Assertions.assertThat;

import com.shansown.daily_interview_pro.day11.Solution.IterSolution;
import com.shansown.daily_interview_pro.day11.Solution.Node;
import com.shansown.daily_interview_pro.day11.Solution.RecSolution;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final List<Solution> solutions = List.of(new IterSolution(), new RecSolution());

  @Test
  void findCeilingFloor() {
    //       8
    //   4       12
    // 2   6   10   14
    final var left = new Node(4, new Node(2), new Node(6));
    final var right = new Node(12, new Node(10), new Node(14));
    final var root = new Node(8, left, right);

    // no floor
    solutions.forEach(solution ->
        assertThat(solution.findCeilingFloor(root, 1)).containsExactly(null, 2));

    // no ceil
    solutions.forEach(solution ->
        assertThat(solution.findCeilingFloor(root, 15)).containsExactly(14, null));

    // equal
    solutions.forEach(solution ->
        assertThat(solution.findCeilingFloor(root, 4)).containsExactly(4, 4));

    // from example (neighbours)
    solutions.forEach(solution ->
        assertThat(solution.findCeilingFloor(root, 5)).containsExactly(4, 6));

    // not neighbours
    solutions.forEach(solution ->
        assertThat(solution.findCeilingFloor(root, 9)).containsExactly(8, 10));
  }
}
