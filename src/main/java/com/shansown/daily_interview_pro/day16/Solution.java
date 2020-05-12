package com.shansown.daily_interview_pro.day16;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int min(int n1, int n2, int n3) {
    return Math.min(Math.min(n1, n2), n3);
  }

  int distance (String s1, String s2) {
    int[][] buff = new int[2][s2.length() + 1];
    int buffRow = 0;

    for (int i = 0; i <= s1.length(); i++) {
      for (int j = 0; j <= s2.length(); j++) {
        buffRow = i % 2;
        int prevBuffRow = buffRow == 0 ? 1 : 0;

        if (i == 0) {
          // if no original string, insertions only
          buff[0][j] = j;
        } else if (j == 0) {
          // if no target string, deletions only
          buff[buffRow][0] = i;
        } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          // char is the same, put prev chars pair computation value
          buff[buffRow][j] = buff[prevBuffRow][j - 1];
        } else {
          // chars are not same, take min from all 3 operations
          buff[buffRow][j] = 1 + min(
              buff[buffRow][j - 1], // insertion
              buff[prevBuffRow][j], // deletion
              buff[prevBuffRow][j - 1] // substitution
          );
        }
      }
    }
    return buff[buffRow][s2.length()];
  }

}
