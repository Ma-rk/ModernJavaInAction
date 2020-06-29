package com.mark.ModernJavaInAction._02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1_FilterAppleTest {
  private List<Apple> appleList;

  @BeforeEach
  void init() {
    appleList = new ArrayList<>();
    appleList.add(new Apple(Color.GREEN));
    appleList.add(new Apple(Color.RED));
    appleList.add(new Apple(Color.GREEN));
    appleList.add(new Apple(Color.RED));
    appleList.add(new Apple(Color.GREEN));
  }

  @Test
  public void testFilterGreenApples() {
    List<Apple> filteredList = _1_FilterApple._1_filterGreenApples(this.appleList);
    filteredList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(filteredList.size(), 3);
  }

  @Test
  public void testFilterAppleByColor() {
    List<Apple> greenAppleList = _1_FilterApple._2_filterAppleByColor(this.appleList, Color.GREEN);
    greenAppleList.forEach(apple -> assertEquals(apple.getColor(), Color.GREEN));
    assertEquals(greenAppleList.size(), 3);

    List<Apple> redAppleList = _1_FilterApple._2_filterAppleByColor(this.appleList, Color.RED);
    redAppleList.forEach(apple -> assertEquals(apple.getColor(), Color.RED));
    assertEquals(redAppleList.size(), 2);
  }
}
