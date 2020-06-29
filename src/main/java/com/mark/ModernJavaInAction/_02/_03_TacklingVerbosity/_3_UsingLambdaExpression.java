package com.mark.ModernJavaInAction._02._03_TacklingVerbosity;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;
import com.mark.ModernJavaInAction._02._02_BehaviorParameterization._1_BehaviorParameterization;

import java.util.List;

public class _3_UsingLambdaExpression {
  public static List<Apple> filterGreenApple(List<Apple> appleList) {
    return _1_BehaviorParameterization.filterApples(appleList, (Apple apple) -> Color.GREEN.equals(apple.getColor()));
  }

  public static List<Apple> filterRedApple(List<Apple> appleList) {
    return _1_BehaviorParameterization.filterApples(appleList, (Apple apple) -> Color.RED.equals(apple.getColor()));
  }
}
