package com.mark.ModernJavaInAction._03_LambdaExpressions;

import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Apple;
import com.mark.ModernJavaInAction._02._01_CopingWithChangingRequirements.Color;
import com.mark.ModernJavaInAction.global.DataFactory;
import lombok.SneakyThrows;

import java.security.PrivilegedAction;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

import static com.mark.ModernJavaInAction._02._04_AbstractingOverListType._4_AbstractingOverListType.filter;

public class _05_TypeCheckingTypeInferenceAndRestrictions {
  @SneakyThrows
  public void sameLambdaDifferentFunctionalInterfaces() {
    // 똑같은 람다 표현식이더라도 호환되는 추상메서드를 가진 다른 함수형 인터페이스로 사용될 수 있다.
    Callable<Integer> c = () -> 83;
    PrivilegedAction<Integer> p = () -> 83;
    System.out.println(c.call());
    System.out.println(p.run());

    // 동일한 람다 표현식을 다양한 함수형 인터페이스에 사용할 수 있다.
    Apple apple1 = new Apple(1);
    Apple apple2 = new Apple(2);

    Comparator<Apple> c1 =
            (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    ToIntBiFunction<Apple, Apple> c2 =
            (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    BiFunction<Apple, Apple, Integer> c3 =
            (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

    System.out.println(c1.compare(apple2, apple1));
    System.out.println(c2.applyAsInt(apple1, apple2));
    System.out.println(c3.apply(apple1, apple2));
  }

  public void typeInference() {
    List<Apple> colorAppleList = DataFactory.getColorAppleList();
    List<Apple> greenApples = filter(colorAppleList, apple -> Color.GREEN.equals(apple.getColor())); // 형식을 명시적으로 표시하지 않았음
    greenApples.forEach(apple -> System.out.println(apple.getColor()));

    // 형식을 표시함
    Comparator<Apple> c1 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    // 형식 표시를 생략함
    Comparator<Apple> c2 = (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());
  }

  public void usingLocalVariables() {
    int num1 = 12345;
    Runnable r1 = () -> System.out.println(num1);
    r1.run();

    int num2 = 23456;
    Runnable r2 = () -> System.out.println(num2);
    // num2 = 34567;
    // 람다 밖에서 선언된 변수를 람다 안에서 사용하려면 변수가 final로 선언돼 있거나 final처럼 사용돼야 한다.
    // 위 라인의 주석을 풀어 num2에 값을 한번 더 할당하는 코드로 변경하면 컴파일 에러가 발생한다.
    r2.run();
  }
}
