package com.shansown.daily_interview_pro.day7;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yehor.lashkul
 */
public class Solution {

  int[] sortNums(int[] arr) {
    final var counters = new TreeMap<Integer, Integer>();

    for (int num : arr) {
      counters.compute(num, (k, v) -> v != null ? v + 1 : 1);
    }

    final var index = new AtomicInteger();
    counters.forEach((num, count) -> Arrays.fill(arr, index.getAndAdd(count), index.get(), num));

    return arr;
  }

}
