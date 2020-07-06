package com.mark.ModernJavaInAction._03_LambdaExpressions;

import org.junit.jupiter.api.Test;

class _02_WhereAndHowToUseLambdasTest {
  @Test
  public void testWhereAndHowToUseLambdas() {
    Runnable r1 = () -> System.out.println("Hello world 1");

    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello world 2");
      }
    };

    _02_WhereAndHowToUseLambdas _02_ = new _02_WhereAndHowToUseLambdas();
    _02_.process(r1);
    _02_.process(r2);
    _02_.process(() -> System.out.println("Hello world 3"));
  }
}