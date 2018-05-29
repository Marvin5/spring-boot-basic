package com.example.demo.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilTest {

  @Test
  public void shouldReturn0WhenGiven0ToFibonacci() {
    assertEquals(0, MathUtil.fibonacci2(0));
  }

  @Test
  public void shouldReturn2WhenGiven3ToFibonacci() {
    assertEquals(2, MathUtil.fibonacci2(3));
  }

  @Test
  public void shouldReturn21WhenGiven8ToFibonacci() {
    assertEquals(21, MathUtil.fibonacci2(8));
  }
}