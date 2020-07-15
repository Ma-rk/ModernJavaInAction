package com.mark.ModernJavaInAction._03_LambdaExpressions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _04_UsingFunctionalInterfacesTest {
  List<String> listOfStrings = List.of("Mark", "", "is", "", "good");
  List<Integer> listOfInt = List.of(1, 2, 3, 4, 5);

  @Test
  public void testPredicate() {
    List<String> nonEmpty = new _04_UsingFunctionalInterfaces().filter(listOfStrings, (String s) -> !s.isEmpty());

    assertEquals(3, nonEmpty.size());
    assertEquals("Mark", nonEmpty.get(0));
    assertEquals("is", nonEmpty.get(1));
    assertEquals("good", nonEmpty.get(2));
  }

  @Test
  public void testConsumer() {
    new _04_UsingFunctionalInterfaces().forEach(listOfInt, (Integer i) -> System.out.println(i));
  }

  @Test
  public void testFunction() {
    List<Integer> intOfLength = new _04_UsingFunctionalInterfaces().map(listOfStrings, (String s) -> s.length());
    assertEquals(4, intOfLength.get(0));
    assertEquals(2, intOfLength.get(2));
    assertEquals(4, intOfLength.get(4));
  }
}
