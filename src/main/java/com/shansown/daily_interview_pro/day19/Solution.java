package com.shansown.daily_interview_pro.day19;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean wordSearch(char[][] matrix, String word) {
    final var firstWordChar = word.charAt(0);

    for (var i = 0; i < matrix.length; i++) {
      for (var j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == firstWordChar
            && (isMatchTheWordLR(matrix, i, j + 1, 1, word)) || isMatchTheWordTB(matrix, i + 1, j, 1, word)) {
          return true;
        }
      }
    }
    return false;
  }

  boolean isMatchTheWordLR(char[][] matrix, int row, int column, int wordChar, String word) {
    while (wordChar < word.length()) {
      if (column >= matrix[row].length || matrix[row][column] != word.charAt(wordChar)) {
        return false;
      }
      column++;
      wordChar++;
    }
    return true;
  }

  boolean isMatchTheWordTB(char[][] matrix, int row, int column, int wordChar, String word) {
    while (wordChar < word.length()) {
      if (row >= matrix.length || matrix[row][column] != word.charAt(wordChar)) {
        return false;
      }
      row++;
      wordChar++;
    }
    return true;
  }
}
