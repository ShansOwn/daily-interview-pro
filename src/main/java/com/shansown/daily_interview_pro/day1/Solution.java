package com.shansown.daily_interview_pro.day1;

/**
 * @author yehor.lashkul
 */
public abstract class Solution {

  abstract Node addTwoNumbers(Node n1, Node n2);

  /**
   * Iterative variant of solution
   */
  static class IterSolution extends Solution {

    Node addTwoNumbers(Node n1, Node n2) {
      var carry = 0;
      Node currResult = null;
      Node result = null;

      while (n1 != null || n2 != null) {
        final var sum = getValue(n1) + getValue(n2);

        final var resValue = (sum % 10) + carry;
        carry = sum / 10;
        final var nextRes = new Node(resValue);

        if (result == null) {
          result = nextRes;
        }
        if (currResult != null) {
          currResult.next = nextRes;
        }
        currResult = nextRes;

        n1 = getNext(n1);
        n2 = getNext(n2);
      }

      if (carry > 0) {
        currResult.next = new Node(carry);
      }

      return result;
    }
  }

  /**
   * Recursive variant of solution
   */
  static class RecSolution extends Solution {

    Node addTwoNumbers(Node n1, Node n2) {
      return addTwoNumbersIter(n1, n2, 0);
    }

    private Node addTwoNumbersIter(final Node n1, final Node n2, final int carry) {
      if (n1 == null && n2 == null) {
        return null;
      }

      final var sum = getValue(n1) + getValue(n2);
      final var resValue = (sum % 10) + carry;
      final var next = addTwoNumbersIter(getNext(n1), getNext(n2), sum / 10);
      return new Node(resValue, next);
    }

  }

  Node getNext(Node node) {
    return node != null ? node.next : null;
  }

  int getValue(Node node) {
    return node != null ? node.value : 0;
  }

  static class Node {

    int value;
    Node next;

    public Node(int value) {
      this(value, null);
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

}
