package com.shansown.daily_interview_pro.day17;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int eval(String exp) {
    var queue = new ArrayDeque<Character>();
    for (var ch : exp.toCharArray()) {
      if (ch != ' ') {
        queue.offer(ch);
      }
    }
    queue.offer(' ');
    return eval(queue);
  }

  int eval(Queue<Character> queue) {
    var result = 0;
    var num = 0;
    var op = '+';

    while (!queue.isEmpty()) {
      var ch = queue.poll();

      if (Character.isDigit(ch)) {
        num = Character.getNumericValue(ch);
      } else if (ch == '(') {
        num = eval(queue);
      } else {
        switch (op) {
          case '+' -> result += num;
          case '-' -> result -= num;
        }
        if (ch == ')') break;
        op = ch;
      }
    }
    return result;
  }
}
