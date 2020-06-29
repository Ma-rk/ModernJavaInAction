package com.mark.ModernJavaInAction._02._02_BehaviorParameterization;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return 150 < apple.getWeight();
  }
}
