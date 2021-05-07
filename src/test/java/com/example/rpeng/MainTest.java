package com.example.rpeng;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
  @Test
  public void testAssert() {
    assertThat(new Object()).isEqualTo(1);
  }
}