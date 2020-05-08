package com.shansown.daily_interview_pro.day12;

/**
 * @author yehor.lashkul
 */
public class Solution {

  Node invert(Node root) {
    if (root == null) {
      return null;
    }
    return new Node(root.value, invert(root.right), invert(root.left));
  }

  static class Node {

    String value;
    Node left;
    Node right;

    Node(String value) {
      this(value, null, null);
    }

    Node(String value, Node left, Node right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }

    String print() {
      StringBuilder builder = new StringBuilder(value);
      if (left != null) {
        builder.append(left.print());
      }
      if (right != null) {
        builder.append(right.print());
      }
      return builder.toString();
    }
  }
}
