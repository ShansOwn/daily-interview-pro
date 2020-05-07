package com.shansown.daily_interview_pro.day11;

/**
 * @author yehor.lashkul
 */
public abstract class Solution {

  abstract Integer[] findCeilingFloor(Node root, int target);

  static class IterSolution extends Solution {

    Integer[] findCeilingFloor(Node root, int target) {
      Integer floor = null;
      Integer ceil = null;

      while (root != null) {
        if (target == root.value) {
          return new Integer[]{target, target};
        }

        if (target > root.value) {
          floor = root.value;
          root = root.right;
        } else {
          ceil = root.value;
          root = root.left;
        }
      }

      return new Integer[]{floor, ceil};
    }
  }

  static class RecSolution extends Solution {

    Integer[] findCeilingFloor(Node root, int target) {
      return findCeilingFloor(root, target, null, null);
    }

    private Integer[] findCeilingFloor(Node root, int target, Integer floor, Integer ceil) {
      if (root == null) {
        return new Integer[]{floor, ceil};
      }

      if (target == root.value) {
        return new Integer[]{target, target};
      }

      return target > root.value
          ? findCeilingFloor(root.right, target, root.value, ceil)
          : findCeilingFloor(root.left, target, floor, root.value);
    }
  }

  static class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
      this(value, null, null);
    }

    Node(int value, Node left, Node right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }
  }

}
