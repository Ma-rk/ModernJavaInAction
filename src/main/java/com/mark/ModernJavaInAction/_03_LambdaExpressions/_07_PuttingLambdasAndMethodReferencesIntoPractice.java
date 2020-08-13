package com.mark.ModernJavaInAction._03_LambdaExpressions;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction.global.DataFactory;

import java.util.Comparator;
import java.util.List;

public class _07_PuttingLambdasAndMethodReferencesIntoPractice {

  public void step1_PassCode() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort(new AppleComparator());
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }

  private static class AppleComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
      return a1.getWeight().compareTo(a2.getWeight());
    }
  }

  public void step2_UseAnAnonymousClass() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort(new Comparator<Apple>() {
      @Override
      public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
      }
    });
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }

  public void step3_UseLambdaExpressions_1() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }

  public void step3_UseLambdaExpressions_2() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }

  public void step3_UseLambdaExpressions_3() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort(Comparator.comparing(apple -> apple.getWeight()));
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }

  public void step4_UseMethodReferences() {
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
    weightAppleList.sort(Comparator.comparing(Apple::getWeight));
    System.out.println();
    weightAppleList.forEach(apple -> System.out.println(apple.getWeight()));
  }
}
