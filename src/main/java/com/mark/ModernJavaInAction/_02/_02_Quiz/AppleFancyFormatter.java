package com.mark.ModernJavaInAction._02._02_Quiz;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;

public class AppleFancyFormatter implements AppleFormatter {
  @Override
  public String accept(Apple apple) {
    String characteristic = 150 < apple.getWeight() ? "heavy" : "light";
    return "A " + characteristic + " " + apple.getColor() + " apple";
  }
}
