package com.shansown.daily_interview_pro.day19;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void wordSearch() {
    char[][] matrix = {
        {'F', 'A', 'C', 'I'},
        {'O', 'B', 'Q', 'P'},
        {'A', 'N', 'O', 'B'},
        {'M', 'A', 'S', 'S'}
    };
    assertThat(solution.wordSearch(matrix, "FOAM"))
        .as("top to bottom within 1 column")
        .isTrue();

    assertThat(solution.wordSearch(matrix, "ANOB"))
        .as("left to right within 1 row")
        .isTrue();

    assertThat(solution.wordSearch(matrix, "ANBA"))
        .as("bottom to top")
        .isFalse();
    assertThat(solution.wordSearch(matrix, "BONA"))
        .as("right to left")
        .isFalse();
    assertThat(solution.wordSearch(matrix, "MABNAC"))
        .as("top to bottom within several columns")
        .isFalse();
    assertThat(solution.wordSearch(matrix, "FACIOB"))
        .as("left to right within several rows")
        .isFalse();
  }

}
