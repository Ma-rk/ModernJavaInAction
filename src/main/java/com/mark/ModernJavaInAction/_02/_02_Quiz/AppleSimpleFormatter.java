package com.mark.ModernJavaInAction._02._02_Quiz;

import com.mark.ModernJavaInAction._02.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
  @Override
  public String accept(Apple apple) {
    return "An apple of " + apple.getWeight() + "g";
  }
}
