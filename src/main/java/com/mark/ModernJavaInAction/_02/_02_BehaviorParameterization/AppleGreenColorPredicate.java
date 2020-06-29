package com.mark.ModernJavaInAction._02._02_BehaviorParameterization;

import com.mark.ModernJavaInAction._02.Apple;
import com.mark.ModernJavaInAction._02.Color;

public class AppleGreenColorPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return Color.GREEN.equals(apple.getColor());
  }
}
