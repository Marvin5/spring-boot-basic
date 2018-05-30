package com.example.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramsUtil {
  private AnagramsUtil() {
  }

  public static List<String> of3(String s) {
    List<String> result = new ArrayList<>();
    if (s.isEmpty()) {
      return result;
    }
    if (s.length() == 1) {
      result.add(s);
      return result;
    }
    List<String> temp = of3(s.substring(0, s.length() - 1));
    for (String s1 : temp) {
      for (int j = 0; j <= s1.length(); j++) {
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(j, s.charAt(s.length() - 1));
        result.add(sb.toString());
      }
    }
    Collections.sort(result);
    return result;
  }

  public static List<String> of(String s) {
    List<String> previousResult = new ArrayList<>();
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      List<String> temp = previousResult;
      previousResult = result;
      temp.clear();
      result = temp;
      char c = s.charAt(i);
      if (previousResult.isEmpty()) {
        result.add(String.valueOf(c));
      }
      for (String s1 : previousResult) {
        for (int j = 0; j <= s1.length(); j++) {
          sb.delete(0, sb.length());
          sb.append(s1);
          sb.insert(j, c);
          result.add(sb.toString());
        }
      }
    }

    Collections.sort(result);
    return result;
  }

}
