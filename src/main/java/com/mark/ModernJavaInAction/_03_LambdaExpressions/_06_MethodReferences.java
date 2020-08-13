package com.mark.ModernJavaInAction._03_LambdaExpressions;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;
import com.mark.ModernJavaInAction.global.DataFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class _06_MethodReferences {
  public void sampleCode1() {
    // 기존 코드
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(a -> System.out.println(a.getWeight()));
    weightAppleList.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
    System.out.println();
    weightAppleList.forEach(a -> System.out.println(a.getWeight()));
  }

  public void sampleCode2() {
    // 메서드 참조와 java.util.Comparator.comparing을 활용한 코드
    List<Apple> weightAppleList = DataFactory.getWeightAppleList();

    weightAppleList.forEach(a -> System.out.println(a.getWeight()));
    weightAppleList.sort(Comparator.comparing(Apple::getWeight));
    System.out.println();
    weightAppleList.forEach(a -> System.out.println(a.getWeight()));
  }

  public void constructorReferences() {
    Supplier<Apple> supp1 = Apple::new; // 이 코드는 아래 코드와 같다
    System.out.println(supp1.get());

    Supplier<Apple> supp2 = () -> new Apple(); // 이 코드는 위 코드와 같다
    System.out.println(supp2.get());

    Function<Integer, Apple> func1 = Apple::new;
    System.out.println(func1);
    Apple a1 = func1.apply(110);
    System.out.println(a1);
    System.out.println(a1.getWeight());

    List<Integer> weights = Arrays.asList(7, 3, 4, 10);
    List<Apple> appleList = map(weights, Apple::new);
    appleList.forEach(System.out::println);

    BiFunction<Color, Integer, Apple> biFunc1 = Apple::new;
    Apple a2 = biFunc1.apply(Color.GREEN, 10);
    System.out.println(a2.getWeight());
    System.out.println(a2.getColor());
  }

  public List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
    List<Apple> resultList = new ArrayList<>();
    for (Integer i : list) {
      resultList.add(f.apply(i));
    }
    return resultList;
  }
}
