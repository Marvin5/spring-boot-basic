package com.example.demo.util;

public class FizzBuzzUtil {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  private FizzBuzzUtil() {
  }

  public static String fizzBuzz(int index) {
    if (index % 3 == 0) {
      if (index % 5 == 0) {
        return FIZZ_BUZZ;
      }
      return FIZZ;
    }
    if (index % 5 == 0) {
      return BUZZ;
    }

    return String.valueOf(index);

  }
}
