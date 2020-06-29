package com.mark.ModernJavaInAction._02._02_BehaviorParameterization;

import com.mark.ModernJavaInAction._02.Apple;

import java.util.ArrayList;
import java.util.List;

public class _1_BehaviorParameterization {
  public static List<Apple> filterApples(List<Apple> inventory,
                                         ApplePredicate p) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }
}
