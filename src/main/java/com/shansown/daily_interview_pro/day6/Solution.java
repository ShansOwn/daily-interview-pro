package com.shansown.daily_interview_pro.day6;

/**
 * @author yehor.lashkul
 */
public abstract class Solution {

  abstract Node reverse(Node head);

  static class IterSolution extends Solution {

    Node reverse(Node head) {
      Node buff = null;
      Node revertedNext = null;
      var curr = head;

      while (curr != null) {
        buff = curr.next;
        curr.next = revertedNext;
        revertedNext = curr;
        curr = buff;
      }

      return revertedNext;
    }
  }

  static class RecSolution extends Solution {

    Node reverse(Node head) {
      return reverseIter(head, null);
    }

    private Node reverseIter(Node node, Node next) {
      return node == null
          ? next
          : reverseIter(node.next, new Node(node.value, next));
    }
  }

  static class Node {

    int value;
    Node next;

    Node(int value) {
      this(value, null);
    }

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    String print() {
      var curr = this;
      final var builder = new StringBuilder();
      while (curr != null) {
        builder.append(curr.value);
        curr = curr.next;
      }
      return builder.toString();
    }
  }

}
