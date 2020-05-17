package com.shansown.daily_interview_pro.day18;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yehor.lashkul
 */
public class Solution {

  boolean findCycle(Map<String, Set<String>> graph) {
    return findCycle(graph, graph.keySet().iterator().next(), null, new HashSet<>());
  }

  private boolean findCycle(Map<String, Set<String>> graph, String vertex, String parent, Set<String> visited) {
    visited.add(vertex);
    return graph.get(vertex).stream()
        .filter(adj -> !adj.equals(parent))
        .anyMatch(adj -> visited.contains(adj)
            || findCycle(graph, adj, vertex, visited));
  }
}
