package com.mark.ModernJavaInAction._02._02_Quiz;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;

import java.util.List;

public class PrettyPrintApple {
  public static void prettyPrintApple(List<Apple> inventory,
                                      AppleFormatter formatter) {
    for (Apple apple : inventory) {
      System.out.println(formatter.accept(apple));
    }
  }
}
