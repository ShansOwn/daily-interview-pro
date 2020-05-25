package com.shansown.daily_interview_pro.day23;

/**
 * @author yehor.lashkul
 */
public class Solution {

  String pushDominoes(String dominoes) {
    char[] dominoesArr = dominoes.toCharArray();
    var startR = 0;
    var endR = 0;
    var startL = 0;
    var endL = 0;
    var prev = ' ';

    for (var i = 0; i < dominoesArr.length; i++) {
      var domino = dominoesArr[i];
      switch (domino) {
        case 'R' -> {
          if (prev != 'R') {
            if (prev == 'L') {
              push(dominoesArr, startL, endL, 'L');
            }
            startR = i;
            prev = 'R';
          }
          endR = i;
        }
        case 'L' -> {
          if (prev != 'L') {
            if (prev == 'R') {
              startL = i;
              push(dominoesArr, startR, endR, 'R');
              pushBoth(dominoesArr, endR, startL);
            }
            prev = 'L';
          }
          endL = i;
        }
      }
    }

    switch (prev) {
      case 'R' -> push(dominoesArr, startR, dominoesArr.length - 1, 'R');
      case 'L' -> push(dominoesArr, startL, endL, 'L');
    }

    return new String(dominoesArr);
  }

  private void push(char[] dominoesArr, int left, int right, char what) {
    for (int i = left; i <= right; i++) {
      dominoesArr[i] = what;
    }
  }

  private void pushBoth(char[] dominoesArr, int left, int right) {
    while (left < right) {
      dominoesArr[left++] = 'R';
      dominoesArr[right--] = 'L';
    }
  }

}
