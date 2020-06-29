package com.mark.ModernJavaInAction._02._04_AbstractingOverListType;

import java.util.ArrayList;
import java.util.List;

public class _4_AbstractingOverListType {
  public static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    for (T t : list) {
      if (p.test(t)) {
        result.add(t);
      }
    }
    return result;
  }
}
