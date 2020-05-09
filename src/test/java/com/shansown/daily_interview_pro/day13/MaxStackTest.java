package com.shansown.daily_interview_pro.day13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author yehor.lashkul
 */
class MaxStackTest {

  @Test
  void test() {
    final var stack = new MaxStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(2);

    assertThat(stack.max())
        .isEqualTo(3);

    assertThat(stack.pop())
        .isEqualTo(2);
    assertThat(stack.pop())
        .isEqualTo(3);

    assertThat(stack.max())
        .isEqualTo(2);
  }
}
