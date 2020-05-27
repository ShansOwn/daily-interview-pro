package com.shansown.daily_interview_pro.day24;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yehor.lashkul
 */
public class Solution {

  ListNode removeConsecutiveSumTo0(ListNode head) {
    final var map = new HashMap<Integer, ListNode>();
    final var dummy = new ListNode(0, head);
    var curr = dummy;
    var sum = 0;

    while (curr != null) {
      sum += curr.val;

      final var zeroFrom = map.get(sum);
      if (zeroFrom != null) {
        remove(map, sum);
        zeroFrom.next = curr.next;
      } else {
        map.put(sum, curr);
      }

      curr = curr.next;
    }
    return dummy.next;
  }

  private void remove(Map<Integer, ListNode> map, int sumExclusive) {
    var toRemove = map.get(sumExclusive).next;
    var sum = sumExclusive + toRemove.val;
    while (sum != sumExclusive) {
      map.remove(sum);
      toRemove = toRemove.next;
      sum += toRemove.val;
    }
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
      this(val, null);
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    String print() {
      var builder = new StringBuilder();
      var curr = this;
      while (curr != null) {
        builder.append(curr.val);
        curr = curr.next;
      }
      return builder.toString();
    }
  }

}
