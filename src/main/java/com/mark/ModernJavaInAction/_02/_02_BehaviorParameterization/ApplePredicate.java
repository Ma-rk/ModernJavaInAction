package com.mark.ModernJavaInAction._02._02_BehaviorParameterization;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;

public interface ApplePredicate {
  boolean test(Apple apple);
}
