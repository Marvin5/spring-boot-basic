package com.example.demo.util;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AnagramsUtilTest {
  @Test
  public void should_return_empty_array_list_when_given_empty_string() {
    List<String> result = AnagramsUtil.of3("");
    assertThat(result.size(), is(0));
  }

  @Test
  public void should_return_a_when_given_a() {
    List<String> result = AnagramsUtil.of3("a");
    assertThat(result.size(), is(1));
    assertThat(result.get(0), is("a"));
  }

  @Test
  public void should_return_ab_ba_when_given_ab() {
    List<String> result = AnagramsUtil.of3("ab");
    assertThat(result.size(), is(2));
    assertThat(result.get(0), is("ab"));
    assertThat(result.get(1), is("ba"));
  }

  @Test
  public void should_return_abc_acb__when_given_abc() {
    List<String> result = AnagramsUtil.of3("abc");
    assertThat(result.size(), is(6));
    assertEquals(result, Arrays.asList(new String[] { "abc", "acb", "bac", "bca", "cab", "cba" }));
  }

  @Test
  public void should_return_24_elements_when_given_abcd() throws IOException {
    List<String> result = AnagramsUtil.of("abcd");
    assertEquals(24, result.size());
    List<String> expectedResult = Arrays.asList(
        new String[] { "abcd", "abdc", "acbd", "acdb", "adbc", "adcb", "bacd", "badc", "bcad", "bcda", "bdac", "bdca", "cabd", "cadb", "cbad", "cbda",
            "cdab", "cdba", "dabc", "dacb", "dbac", "dbca", "dcab", "dcba" });
    assertEquals(expectedResult, result);

  }
}