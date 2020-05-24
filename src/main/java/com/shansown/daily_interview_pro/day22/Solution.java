package com.shansown.daily_interview_pro.day22;

/**
 * @author yehor.lashkul
 */
public class Solution {

  ListNode intersection(ListNode a, ListNode b) {
    ListNode p1 = a;
    ListNode p2 = b;

    while (p1 != p2) {
      p1 = p1 != null ? p1.next : b;
      p2 = p2 != null ? p2.next : a;
    }

    return p1;
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
  }
}
