package com.example.demo.util;

public class MathUtil {
  private MathUtil() {
  }

  public static int fibonacci(int index) {
    if (index < 0) {
      throw new IllegalArgumentException();
    }
    if (index == 0) {
      return 0;
    }
    if (index == 1) {
      return 1;
    }
    return fibonacci(index - 1) + fibonacci(index - 2);
  }

  public static int fibonacci2(int index) {
    int f0 = 0;
    int f1 = 1;
    if (index == 0) {
      return f0;
    }
    if (index == 1) {
      return f1;
    }
    int currentFib = 0;
    for (int i = 2; i <= index; i++) {
      currentFib = f0 + f1;
      f0 = f1;
      f1 = currentFib;
    }
    return currentFib;
  }

}
