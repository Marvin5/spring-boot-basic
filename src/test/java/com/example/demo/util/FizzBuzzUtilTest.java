package com.example.demo.util;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzUtilTest {
  @Test
  public void when_input_1_should_return_1() {
    String result = FizzBuzzUtil.fizzBuzz(1);
    assertThat(result, is("1"));
  }

  @Test
  public void when_input_3_should_return_Fizz() {
    String result = FizzBuzzUtil.fizzBuzz(3);
    assertThat(result, is("Fizz"));
  }

  @Test
  public void when_input_5_should_return_Buzz() {
    String result = FizzBuzzUtil.fizzBuzz(5);
    assertThat(result, is("Buzz"));
  }

  @Test
  public void when_input_15_should_return_FizzBuzz() {
    String result = FizzBuzzUtil.fizzBuzz(15);
    assertThat(result, is("FizzBuzz"));
  }

}