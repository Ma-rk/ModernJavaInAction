package com.mark.ModernJavaInAction._02;


import java.util.ArrayList;
import java.util.List;

public class _1_FilterApple {
  public static List<Apple> _1_filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (Color.GREEN.equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }

  public static List<Apple> _2_filterAppleByColor(List<Apple> inventory, Color color) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getColor().equals(color)) {
        result.add(apple);
      }
    }
    return result;
  }
}
