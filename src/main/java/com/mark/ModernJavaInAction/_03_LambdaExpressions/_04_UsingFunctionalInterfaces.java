package com.mark.ModernJavaInAction._03_LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 3.4 함수형 인터페이스 사용
 */
public class _04_UsingFunctionalInterfaces {
  // 3.4.1 Predicate
  public <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> results = new ArrayList<>();
    for (T t : list) {
      if (p.test(t)) {
        results.add(t);
      }
    }
    return results;
  }

  // 3.4.2 Consumer
  public <T> void forEach(List<T> list, Consumer<T> c) {
    for (T t : list) {
      c.accept(t);
    }
  }

  // 3.4.3 Function
  public <T, R> List<R> map(List<T> list, Function<T, R> f) {
    List<R> result = new ArrayList<>();
    for (T t : list) {
      result.add(f.apply(t));
    }
    return result;
  }
}
