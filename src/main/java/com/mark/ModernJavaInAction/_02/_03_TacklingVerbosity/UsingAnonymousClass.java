package com.mark.ModernJavaInAction._02._03_TacklingVerbosity;


import java.util.List;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization.ApplePredicate;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization._1_BehaviorParameterization;

public class UsingAnonymousClass {
  public static List<Apple> filterGreenApple(List<Apple> appleList) {
    return _1_BehaviorParameterization.filterApples(appleList, new ApplePredicate() {
      @Override
      public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
      }
    });
  }

  public static List<Apple> filterRedApple(List<Apple> appleList) {
    return _1_BehaviorParameterization.filterApples(appleList, new ApplePredicate() {
      @Override
      public boolean test(Apple apple) {
        return apple.getColor().equals(Color.RED);
      }
    });
  }
}
