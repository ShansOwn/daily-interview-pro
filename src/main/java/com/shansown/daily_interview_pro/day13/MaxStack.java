package com.shansown.daily_interview_pro.day13;

import java.util.LinkedList;
import java.util.Optional;

/**
 * @author yehor.lashkul
 */
public class MaxStack {

  private final LinkedList<Node> stack = new LinkedList<>();

  void push(int value) {
    final var node = Optional.ofNullable(stack.peekLast())
        .map(last -> new Node(value, Math.max(value, last.max)))
        .orElse(new Node(value));
    stack.add(node);
  }

  Integer pop() {
    return Optional.ofNullable(stack.pollLast())
        .map(node -> node.value)
        .orElse(null);
  }

  Integer max() {
    return Optional.ofNullable(stack.peekLast())
        .map(node -> node.max)
        .orElse(null);
  }

  static class Node {
    int value;
    int max;

    Node(int value) {
      this(value, value);
    }

    Node(int value, int max) {
      this.value = value;
      this.max = max;
    }
  }
}
