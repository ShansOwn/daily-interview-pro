package com.shansown.daily_interview_pro.day4;

import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/**
 * @author yehor.lashkul
 */
public class Solution {

  private final Map<String, String> bracketsPairs = Map.of("(", ")", "[", "]", "{", "}");

  boolean isValid(String str) {
    if (str.isEmpty()) {
      return true;
    }

    final var brackets = str.split("");
    final var foundOpeningBrackets = new LinkedList<String>();

    for (final var currentBracket : brackets) {
      if (isOpeningBracket(currentBracket)) {
        foundOpeningBrackets.add(currentBracket);
      } else {
        final var lastOpeningBracket = foundOpeningBrackets.pollLast();
        if (!isBracketsPair(lastOpeningBracket, currentBracket)) {
          return false;
        }
      }
    }

    return foundOpeningBrackets.isEmpty();
  }

  private boolean isOpeningBracket(String bracket) {
    return bracketsPairs.containsKey(bracket);
  }

  private boolean isBracketsPair(String openingBracket, String closingBracket) {
    return Objects.equals(bracketsPairs.get(openingBracket), closingBracket);
  }
}
