package com.mark.ModernJavaInAction._02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1_FilterAppleTest {
  @Test
  public void testFilterGreenApples() {
    List<Apple> list = new ArrayList<>();
    list.add(new Apple(Color.GREEN));
    list.add(new Apple(Color.RED));
    list.add(new Apple(Color.GREEN));
    list.add(new Apple(Color.RED));
    list.add(new Apple(Color.GREEN));
    List<Apple> filteredList = _1_FilterApple._1_filterGreenApples(list);
    filteredList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(filteredList.size(), 3);
  }
}
